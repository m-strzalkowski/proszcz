#include<iostream>
#include<fstream>
#include<cmath>

using namespace std;

using funkcja = float (*)(float x, float y);
int max_c = 100;
float c_min = -5; 
float c_max = 5;
void gen(string nazwa, funkcja f, int liczba_arg, float s, float k, float d)
{
    ofstream plik;
    plik.open(nazwa);
    if(!plik.good())
    {
        return;
    }
    int n = (k - s)/d + 1;
    plik << liczba_arg << " " << max_c << " " << c_min << " " << c_max << " " << pow(n,liczba_arg) << endl;
    int ny = n;
    for(int i = 0; i < n; ++i)
    {
        if(liczba_arg == 2)
        {
            for(int j = 0; j < ny; ++j)
            {
                plik << s + i*d << "\t" << s + j*d << "\t" << f(s + i*d, s + j*d )<< endl;
            }
        }
        else
        {
            plik << s + i*d << "\t" << f(s + i*d,0) << endl;
        }
    }

    plik.close(); 
}

float f1(float x, float y)
{
    return 5*x*x*x - 2*x*x + 3*x - 17;
}
float f2(float x, float y)
{
    return sin(x) + cos(x);
}
float f3(float x, float y)
{
    return 2*log(x + 1);
}
float f4(float x, float y)
{
    return x + 2*y;
}
float f5(float x, float y)
{
    return sin(x/2) + 2*cos(y);
}
float f6(float x, float y)
{
    return x*x + 3*x*y - 7*y + 1;
}
float fz6(float x, float y)
{
    return sin(x + 3.141592/2);
}
float fz7(float x, float y)
{
    return tan(2*x +1);
}
int main()
{
    gen("f1a.dat", f1, 1, -10, 10, 0.1);
    gen("f1b.dat", f1, 1, 0, 100, 0.5);
    gen("f1c.dat", f1, 1, -1, 1, 0.01);
    gen("f1d.dat", f1, 1, -1000, 1000, 10);

    gen("f2a.dat", f2, 1, -3.14, 3.14, 0.03);
    gen("f2b.dat", f2, 1, 0, 7, 0.05);
    gen("f2c.dat", f2, 1, 0, 100, 0.5);
    gen("f2d.dat", f2, 1, -100, 100, 1);

    gen("f3a.dat", f3, 1, 0, 4, 0.1);
    gen("f3b.dat", f3, 1, 0, 9, 0.1);
    gen("f3c.dat", f3, 1, 0, 99, 1);
    gen("f3d.dat", f3, 1, 0, 999, 10);

    gen("f4a.dat", f4, 2, 0, 1, 0.05);
    gen("f4b.dat", f4, 2, -10, 10, 0.5);
    gen("f4c.dat", f4, 2, 0, 100, 10);
    gen("f4d.dat", f4, 2, -1000, 1000, 100);

    gen("f5a.dat", f5, 2, -3.14, 3.14, 0.5);
    gen("f5b.dat", f5, 2, 0, 7, 0.5);
    gen("f5c.dat", f5, 2, 0, 100, 10);
    gen("f5d.dat", f5, 2, -100, 100, 20);

    gen("f6a.dat", f6, 2, -10, 10, 1);
    gen("f6b.dat", f6, 2, 0, 100, 10);
    gen("f6c.dat", f6, 2, -1, 1, 0.1);
    gen("f6d.dat", f6, 2, -1000, 1000, 200);

    gen("fz6.dat", fz6, 1, 0, 3.141592*2, 0.03);
    gen("fz7.dat", fz7, 1, -3.141592/2, 3.141592/2, 0.03);
}