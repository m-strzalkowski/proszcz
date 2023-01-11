grammar ProszczGP;
plik: instrukcja* EOF;
instrukcja: (
    echo
    |ustaw_nazwe
    |ustaw_katalog
    |wykonaj_skrypt
    |przypadki
    |pisz_przypadki
    |funkcja_przystosowania
    |srodowisko
    |listuj_srodowiska
    |rozmiar_populacji
    |inicjalizacja_populacji
    |zapis_populacji
    |odczyt_populacji
    |listuj_populacje
    |nastepne
    |statystyki
    |nr_obecnej_generacji
    |inspekcja
    |koniec_inspekcji
    |inspekcja_srodowiska
    |zakoncz
    |wstrzykniecie_osobnika_do_srodowiska
    |waga_operatora_genetycznego
    |listuj_operatory_genetyczne
) EOS;
echo:'echo' (NAPIS_DOSL|NAZWA);
ustaw_nazwe:'name' NAZWA;
ustaw_katalog:'cd' (NAPIS_DOSL|NAZWA);
wykonaj_skrypt:'exec' (NAPIS_DOSL|NAZWA);
przypadki: 'cases' 'from' (NAPIS_DOSL|NAZWA) opcja_przypadkow*;
    opcja_przypadkow:('tinygp'|'plain');
pisz_przypadki:'show' 'cases' (STALA/*od początku*/ ','? STALA/*od końca*/)?;
funkcja_przystosowania: 'fitfunc' 'from' fprzyst_klasa;
    fprzyst_klasa: 'class' NAZWA ('in' NAPIS_DOSL)?;
srodowisko: 'env' NAZWA 'from' NAPIS_DOSL/*nazwa pliku*/;
listuj_srodowiska:'envs';
rozmiar_populacji:'popsize' NAZWA STALA;
inicjalizacja_populacji:'initpop' NAZWA typ=('grow'|'full'|'ramped-and-a-half'|'rah') STALA/*maks. głębokość*/;
zapis_populacji:'writepop' NAZWA ((zapis_populacji_gdzie)|(STALA/*od początku*/ ','? STALA/*od końca*/)?);/*wypisz populację lub zapisz do pliku*/
zapis_populacji_gdzie:('to' (NAPIS_DOSL|NAZWA));
odczyt_populacji:'readpop' NAZWA odczyt_populacji_gdzie;
odczyt_populacji_gdzie:('from' (NAPIS_DOSL|NAZWA));
listuj_populacje:'pops';
nastepne:'fwd' STALA?;
statystyki:'stats' STALA?/*od*/ STALA?/*do*/;
nr_obecnej_generacji:'gen';
inspekcja:'inspect';
koniec_inspekcji:'resume';
inspekcja_srodowiska:'inspect' 'env' NAZWA;
zakoncz:'halt';
wstrzykniecie_osobnika_do_srodowiska:
('inject' 'specimen' STALA 'from' 'population' NAZWA 'to' 'environment' NAZWA)
|('inj' NAZWA ':'STALA '>' NAZWA);
waga_operatora_genetycznego:('op'|'genetic-operator') NAZWA STALA zn=('%'|'‰');
listuj_operatory_genetyczne:('ops'|'genetic-operators');

EOS:';';//END OF STATEMENT
NAZWA:[A-Za-z]([A-Za-z0-9_/.])*;
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
SL_COMMENT:   '//' .*? ('\n'|EOF) -> skip;
WS  :   [ \t\r\n]+ -> skip ; // ignorowanie białych znaków