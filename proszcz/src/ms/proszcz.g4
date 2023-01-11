grammar proszcz;
import leksproszcz;
//program : wyrazenie EOF;
program : instrukcja* EOF;
proces: deklaracja_procesu EOF;//drugi punkt wejścia do gramatyki
instrukcja : instrukcja_procesowa | instrukcja_silnika |dodatek;
instrukcja_silnika : uruchomienie
                   | wypisanie
                   | reset_silnika
                   | pokaz_drzewo
                   | logi;
wypisanie: wypisanie_krotkie | wypisanie_rekursywne;
wypisanie_krotkie: 'ls' NAZWA? EOS;
wypisanie_rekursywne: 'll' NAZWA? EOS;
pokaz_drzewo:'show' (rek=('-r'|'-R'))? NAZWA (',' NAZWA)* EOS;
uruchomienie: 'run' NAZWA EOS;
reset_silnika: 'reset' EOS;
logi: 'trace' EOS;
instrukcja_procesowa: deklaracja_procesu | import_procesu | deport_procesu|typ_ewaluacji;
import_procesu: 'use' ((special=('^'|'parent'))|(NAZWA (',' NAZWA)*)) EOS;
deport_procesu: 'use-not' NAZWA(',' NAZWA)* EOS;
typ_ewaluacji:(LENIWA | SPRYTNA | GORLIWA) EWALUACJA EOS;
deklaracja_procesu: desygnat_celu? blok_procesowy? wyrazenie zapis_segmentu_anonimowego? EOS;
desygnat_celu: NAZWA (',' NAZWA)* op=('::='|'::+=');
zapis_segmentu_anonimowego: LNAWIAS_Z_KRATKA ((znak=('-'|'+'))? STALA)* PNAWIAS_Z_KRATKA;
blok_procesowy: ZAWIJAS_LEWY
                 naglowek_bloku_procesowego?
                 instrukcja_procesowa*
                ZAWIJAS_PRAWY;
naglowek_bloku_procesowego: arnosc (',' zawijanie_pamieci)?EOS;
arnosc:STALA '~' STALA ;
zawijanie_pamieci: '%' STALA;

wyrazenie
          : znak=('-'| '+') wyrazenie                   #wyrazenieZnak
          | wyrazenie mult=('*' | '/' |'%') wyrazenie   #wyrazenieMult
          | wyrazenie addyt=('+' | '-') wyrazenie       #wyrazenieAddyt
          | wyrazenie '&' wyrazenie                     #wyrazenieILgicz
          | wyrazenie '|' wyrazenie                     #wyrazenieLubLgicz
          | wyrazenie porownanie=('~=' | '!~=' | '>' | '<' )wyrazenie    #wyrazeniePorownanie
          | <assoc=right> wyrazenie ':=' wyrazenie                      #wyrazeniePrzypisanie
//          | SYNONIM                                     #wyrazenieDereferencjaZmiennej
          | '.' NAZWA                                     #wyrazenieAdresZmiennej
          | STALA                                       #wyrazenieStala
          | NAZWA ('(' lista_wyrazen ')')?             #wyrazenieWywolanie
          | '[' wyrazenie ']'                           #wyrazenieDereferencja
          | '(' wyrazenie ')'                           #wyrazenieNawiasy
          |   '{' nastepstwo_wyrazen '}'                #wyrazenieInstrukcjaZlozona
          |   'if' '(' wyrazenie ')'  wyrazenie 'else' wyrazenie #wyrazenieInstrukcjaWarunkowa
          |   'while' '(' wyrazenie ')' wyrazenie       #wyrazeniePetelka
          |   'break_with' wyrazenie                                  #wyrazeniePrzerwaniePetelki
          ;
//wywolanie_funkcji   :  NAZWA '(' lista_wyrazen ')';
lista_wyrazen : (wyrazenie  (',' wyrazenie)*)?;
nastepstwo_wyrazen : ( wyrazenie ';')*;
//zmienna: ZMIENNA;
//stala_atom: STALA;
//
//DODATKI ZLUZACE DO TESTOWANIA ROZNYCH MECHANIZMOW
dodatek:(generacja|mutacja|krzyzowanie|pokoloruj|wezel_dod|nieterm_dod|term_dod|pokaz_generatory|kopiowanie_dod|waga) EOS;
waga: 'weight' ('of')? desygnat_wagi (',' desygnat_wagi)* ':' STALA atrybut_wagi*;
desygnat_wagi: ((('node')? NAPIS_DOSL)|(('call')? NAZWA))('['STALA']')?;
atrybut_wagi: typ=('min'|'max'|'roundexp')'='STALA;
generacja:typ=('full'|'grow') glebokosc cel_dodatku?;
mutacja:typ=('s'|'subtree'|'sfs'|'size-fair-subtree'|'p'|'point') '-mutate' zrodlo_dodatku poz_dodatek? 'depth' glebokosc cel_dodatku?;
krzyzowanie: 'cross' krzyzowanie_arg 'with' krzyzowanie_arg cel_dodatku?;
krzyzowanie_arg : NAZWA poz_dodatek?;
kopiowanie_dod: 'dcpy' NAZWA poz_dodatek?  cel_dodatku?;
wartosc:STALA;
glebokosc:STALA;
cel_dodatku: 'into' NAZWA;
zrodlo_dodatku: NAZWA;
poz_dodatek:'at' STALA;
pokoloruj:('color'|'colour') NAZWA (',' NAZWA)* (KOLOR_HTML|KOLOR_HTML_KROTKI) poz_dodatek?;
pokaz_generatory: ('generators'|'gens');
wezel_dod:'node' par_dod? par_dod?;
nieterm_dod:'nonterm' par_dod? par_dod?;
term_dod: 'term' par_dod? par_dod?;
par_dod:STALA;
KOLOR_HTML:'#'[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F];
KOLOR_HTML_KROTKI:'#'[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F];

