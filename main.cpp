#include <iostream>
#include <windows.h>
#include <ctime>
#include <cstdlib>

using namespace std;

void menu();
void remis();
void gra();

/* Piotr Balcerski, Adrian Świątelski 2kg_g1 */

int main() {
	
	menu();
	
}


int liczba_graczy, rzut1, rzut2, wyniki_1[4], wyniki_2[4], suma[4], command, rmax, punkty[50];

string nick[4];


void menu() {
		cout << "****** witaj w grze ******" << endl;
	cout << "* 1. Start gry      \t*" << endl;
	cout << "* 2. Wyjscie z gry  \t*" << endl;
	cout << "* 3. Informacje  \t*" << endl;
	cout << "**************************" << endl;
	cin >> command;
	
	switch(command)
	{
		case 1: 
			{
				gra();
			} break;
		case 2:
			{
				cout << "gra zostanie wylaczona!"; Sleep(2000);
				exit(0);
			} break;
		case 3:
			{
				cout << "autorzy: Piotr Balcerski, Adrian Swiatelski" << endl;
				cout << "jezyk programowania: c++" << endl;
			} break;
		default: 
			{
				cout << "przykro mi ale nie ma takiej opcji!" << endl; Sleep(2000);
				menu();
			} break;
	}
}

void remis() 
{
	if()
}

void gra() 
{	
	srand((unsigned)time(0));
	cout << "ilu jest graczy (max 4)" << endl;
	cin >> liczba_graczy;
	
	
	if(liczba_graczy < 1 || liczba_graczy > 4) 
	{
		cout << "nieprawidlowa ilosc graczy sprobuj ponownie" << endl; Sleep(2000);
		gra();
	}
	else 
	{
		for (int i = 0; i < liczba_graczy; i++) 
		{
			cout << "podaj swoj nick" << endl;
			cin >> nick[i];
			cout << endl;
		}
		for (int i = 0; i < liczba_graczy; i++) 
		{
			rzut1 = rand() % 6 + 1;
			rzut2 = rand() % 6 + 1;
			wyniki_1[i] = rzut1;
			wyniki_2[i] = rzut2;
			suma[i] = rzut1 + rzut2;
		}
	}
		rmax = suma[0];
		for (int i = 1; i < liczba_graczy; i ++) 
		{
			if (rmax < suma[i])	
				rmax = suma[i];
				cout << nick[i] << " wygral bo ma najwiecej punktow " << rmax << endl;
		}
		
	for (int i = 0; i < liczba_graczy; i++) 
	{
		cout << nick[i] << " uzyskal z jednej kostki " << wyniki_1[i] << endl;
		cout << nick[i] << " uzyskal z drugiej kostki " << wyniki_2[i] << endl;
		cout << nick[i] << " uzyskal lacznie " << suma[i] << endl;	
	}
	
}
