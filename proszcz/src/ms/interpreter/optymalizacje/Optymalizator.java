package ms.interpreter.optymalizacje;

import ms.Tablice;
import ms.drzewo.Jednomianowy;

import static java.lang.Math.abs;

public class Optymalizator {
    Jednomianowy drzewo=null;
    public Optymalizator(Jednomianowy drzewo)
    {
        this.drzewo=drzewo;
    }
    public void spłaszczanie()
    {

    }
    public void redukcje()
    {
        redukuj(drzewo);
    }
    private void pisz_redukcję(Jednomianowy rodzic, Jednomianowy dz1, Jednomianowy dz2)
    {
        System.out.print("RED:"+rodzic.txtRepr()+"|"+dz1.txtRepr()+"|"+dz2.txtRepr());
        System.out.println("||:"+rodzic.internalRepr()+"|"+dz1.internalRepr()+"|"+dz2.internalRepr());
    }
    private void redukuj(Jednomianowy r)
    {
        for (var dz:r.dzieci)
        {
            redukuj(dz);
        }
        if(r.dzieci.size() == 2)
        {
            Jednomianowy a = r.dzieci.get(0);
            Jednomianowy b = r.dzieci.get(1);
            if(a.zawartość == Jednomianowy.Zawartość.JEDNOMIAN && b.zawartość == Jednomianowy.Zawartość.JEDNOMIAN
                    &&!(a.zm!=null && b.zm!= null && !(a.zm.equals(b.zm))))//Wykluczamy dwie nie puste, różne zmienne
            {

                switch (r.zawartość)
                {
                    case PLUS:
                    case MINUS:
                        if((a.st == b.st) && ((a.zm == null)?(b.zm == null):(a.zm.equals(b.zm))))//&& ((a.zm == null)?(b.zm == null):(a.zm.equals(b.zm)))
                        {
                            r.st=a.st;

                            switch (r.zawartość)
                            {
                                case PLUS:r.wt = a.wt + b.wt;
                                break;
                                case MINUS:r.wt = a.wt - b.wt;
                                break;
                            }
                        }
                        else{return;}
                        break;

                    case RAZY:
                    case DZIEL:
                        switch (r.zawartość)
                        {
                            case RAZY:r.wt = a.wt * b.wt;
                                    r.st = a.st + b.st;
                                break;
                            case DZIEL:
                                if(b.zm == null && abs(b.wt)<= Tablice.PRÓG_DZIWNODZIELENIA)
                                {
                                    r.wt=a.wt;
                                    r.st=a.st;
                                }
                                else{
                                    r.wt = a.wt / b.wt;
                                    r.st = a.st - b.st;
                                }

                                break;
                            default:return;
                        }
                        break;
                    default:return;
                }
                //pisz_redukcję(r,a,b);
                //zmiana obecnego węzła
                r.zm = (a.zm==null)?(b.zm):(a.zm);
                r.zawartość = Jednomianowy.Zawartość.JEDNOMIAN;
                r.dzieci.clear();//odcinanie dzieci!

            }
        }
    }
}
