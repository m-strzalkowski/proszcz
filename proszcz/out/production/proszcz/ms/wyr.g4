grammar wyr;
import lekswyr;
program : wyrazenie EOF;
wyrazenie
          : wywolanie_funkcji                           #wyrazenieWywolanie
          | zmienna                                 #wyrazenieZmienna
          | znak=('-'| '+') wyrazenie                   #wyrazenieZnak
          | wyrazenie mult=('*' | '/' |'%') wyrazenie   #wyrazenieMult
          | wyrazenie addyt=('+' | '-') wyrazenie       #wyrazenieAddyt
          //| wyrazenie logicz=('&&' | '||')wyrazenie    #wyrazenieLogicz
          | stala_atom                             #wyrazenieStala
          | '(' wyrazenie ')'                           #wyrazenieNawiasy
          ;
wywolanie_funkcji   :  NAZWA '(' lista_parametrow_aktualnych ')';
lista_parametrow_aktualnych : (wyrazenie  (',' wyrazenie)*)?;
zmienna: ZMIENNA;
stala_atom: STALA;