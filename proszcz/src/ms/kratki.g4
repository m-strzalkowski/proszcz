grammar kratki;
//( [1,10]I/10 x [-1,1]R/<0,10>L )* 2
cala_kratka: kratka EOF;
kratka :podkratka ('x' podkratka)*;
podkratka:wymiar | powtorzenie;
powtorzenie: ((wymiar)|('(' kratka ')')) '*' zakres_losowy;
wymiar: przedzial probkowanie_przedzialu?'/'zakres_losowy;
przedzial:'['  STALA ',' STALA']';
zakres_losowy: STALA | ('<'STALA','STALA '>'rozklad_losowy?);
rozklad_losowy: JEDN | LOG;
probkowanie_przedzialu: INKREMENTACYJNE | RANDOMIZOWANE;
INKREMENTACYJNE:'I';
RANDOMIZOWANE:'R';
JEDN: 'J';
LOG: 'L';
EOS:';';//END OF STATEMENT
//NAZWA:[A-Za-z]([A-Za-z0-9_/.])*;
//SCIEZKA:([A-Za-z0-9_/.])+;
//SYNONIM:[a-z];//synonim za 1,2,3...
NAPIS_DOSL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\''|'\\');


// §3.10.2 Floating-Point Literals
STALA//FloatingPointLiteral
	:	 '-'?(DecimalFloatingPointLiteral
	|	 HexadecimalFloatingPointLiteral
	|    IntegerLiteral)
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	|	'.' Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment
ExponentIndicator
	:	[eE]
	;

fragment
SignedInteger
	:	Sign? Digits
	;

fragment
Sign
	:	[+\-]
	;

fragment
FloatTypeSuffix
	:	[fFdD]
	;

fragment
HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FloatTypeSuffix?
	;

fragment
HexSignificand
	:	HexNumeral '.'?
	|	'0' [xX] HexDigits? '.' HexDigits
	;

fragment
BinaryExponent
	:	BinaryExponentIndicator SignedInteger
	;

fragment
BinaryExponentIndicator
	:	[pP]
	;


IntegerLiteral
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	OctalIntegerLiteral
	|	BinaryIntegerLiteral
	;

fragment
DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?
	;

fragment
HexIntegerLiteral
	:	HexNumeral IntegerTypeSuffix?
	;

fragment
OctalIntegerLiteral
	:	OctalNumeral IntegerTypeSuffix?
	;

fragment
BinaryIntegerLiteral
	:	BinaryNumeral IntegerTypeSuffix?
	;

fragment
IntegerTypeSuffix
	:	[lL]
	;

fragment
DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment
Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment
Underscores
	:	'_'+
	;

fragment
HexNumeral
	:	'0' [xX] HexDigits
	;

fragment
HexDigits
	:	HexDigit (HexDigitsAndUnderscores? HexDigit)?
	;

fragment
HexDigit
	:	[0-9a-fA-F]
	;

fragment
HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment
HexDigitOrUnderscore
	:	HexDigit
	|	'_'
	;

fragment
OctalNumeral
	:	'0' Underscores? OctalDigits
	;

fragment
OctalDigits
	:	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
	;

fragment
OctalDigit
	:	[0-7]
	;

fragment
OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+
	;

fragment
OctalDigitOrUnderscore
	:	OctalDigit
	|	'_'
	;

fragment
BinaryNumeral
	:	'0' [bB] BinaryDigits
	;

fragment
BinaryDigits
	:	BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
	;

fragment
BinaryDigit
	:	[01]
	;

fragment
BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+
	;

fragment
BinaryDigitOrUnderscore
	:	BinaryDigit
	|	'_'
	;
COMMENT : '/*' .*? '*/' -> skip ; // Match "/*" stuff "*/
WS  :   [ \t\r\n]+ -> skip ; // ignorowanie białych znaków
