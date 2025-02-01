#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

// Headers
string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    cout << "Ciao!" << endl;
    cout << "cosa vuoi fare? secchio da 1 litro, bacinella da 0,2 litri o cisterna da 1000 litri?" << endl;
    string scelta;

    cin >> scelta;
    if (scelta == "secchio") {
        double litri, capacità, litritot;

        litritot = 0;
        capacità = 1000;
        cout << "ok riempi il secchio fino a 1 litro (1000 ml)" << endl;
        while (litritot < capacità) {
            cout << "Inserisci litri" << endl;
            cout << litritot << endl;
            cin >> litri;
            litritot = litri + litritot;
        }
        if (litri == capacità) {
            cout << "hai riempito al 100%!" << endl;
        } else {
            cout << "hai riempito troppo" << endl;
            cout << litritot << endl;
        }
    } else {
        if (scelta == "bacinella") {
            double litri, capacità, litritot;

            litritot = 0;
            capacità = 200;
            cout << "ok riempi la bacinella fino a 0,2 litri (200 ml)" << endl;
            while (litritot < capacità) {
                cout << "Inserisci litri" << endl;
                cout << litritot << endl;
                cin >> litri;
                litritot = litri + litritot;
            }
            if (litri == capacità) {
                cout << "hai riempito al 100%!" << endl;
            } else {
                cout << "hai riempito troppo" << endl;
                cout << litritot << endl;
            }
        } else {
            double litri, capacità, litritot;

            litritot = 0;
            capacità = 1000000;
            cout << "ok riempi cisterna fino a 1000 litri (1000000 ml)" << endl;
            while (litritot < capacità) {
                cout << "Inserisci litri" << endl;
                cout << litritot << endl;
                cin >> litri;
                litritot = litri + litritot;
            }
            if (litri == capacità) {
                cout << "hai riempito al 100%!" << endl;
            } else {
                cout << "hai riempito troppo" << endl;
                cout << litritot << endl;
            }
        }
    }
    cout << "digita fine" << endl;
    string fine;

    cin >> fine;
    return 0;
}

// The following implements type conversion functions.
string toString (double value) { //int also
    stringstream temp;
    temp << value;
    return temp.str();
}

int toInt (string text) {
    return atoi(text.c_str());
}

double toDouble (string text) {
    return atof(text.c_str());
}
