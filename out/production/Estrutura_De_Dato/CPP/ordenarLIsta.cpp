#include <stdio.h>

/*
 * ordenar una lista
 */
 
int main ()
{

    int m[10] = { 1, 5, 6, 8, 7, 100, 2, 6, 5, 4 };
    int aux;


    for (int x = 0; x < 10; x++)
    {
        for (int y = 0; y < 9; y++)
        {
            if (m[y] > m[y + 1])
            {
                aux = m[y];
                m[y] = m[y + 1];
                m[y + 1] = aux;
            }
        }
    }


    for (int x = 0; x < 10; x++)
    {
        printf ("%d\n", m[x]);
    }

}
