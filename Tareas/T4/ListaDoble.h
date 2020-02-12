#ifndef LISTAARTISTA_H_INCLUDED
#define LISTAARTISTA_H_INCLUDED

#include <iostream>
#include <bits/stdc++.h>

using namespace std;


class ListaDoble
{
    class Nodo{

public:
    Nodo(string name_)
    {

        next = 0;
        before = 0;
        name = name_;

    }

    Nodo *getNext(){ return next;}
    Nodo *getBefore(){return before;}
    void setNext(Nodo *n){next = n;}
    void setBefore(Nodo *n){before = n;}
    Artista *getDato(){ return dato;}
    string getName(){return name;};


private:
    Nodo *next;
    Nodo *before;
    string name;

    };

private:
    int size;
    Nodo *first;
    Nodo *last;
    bool isEmpty(){return size == 0;}

public:
    ListaDoble(){

        first = 0;
        last = 0;
        size = 0;

    }

    int getsize(){return size;}
    void add_first(char a);

    Artista *get_element_at(string nombre);

    Artista remove_last();




};






void ListaDoble::add_first(char a)
{
Nodo *n = new Nodo(name);
if (isEmpty())
{
    this ->first = n;
    this ->last = n;
    this ->size++;

} else
{

    n->setNext(this->first);
    this->first->setBefore(n);
    this->first = n;
    this ->size++;

}
}


//Metodos para remover Nodos



Artista ListaDoble::remove_last()
{

    if(!isEmpty())
    {

        if(this->size == 1){

            this->first = 0;
            this->last = 0;
            size--;

        } else{

            Nodo *aux = this->last;
            this->last = this->last->getBefore();
            aux->getBefore()->setNext(0);
            aux->setBefore(0);
            delete aux;

            cout<<aux->getDato()<<endl;
            size--;

        }

    }

}



Artista *ListaDoble::get_element_at(string name)
{

char stringsep[90];
 strcpy(stringsep,name.c_str());

    if(index >= 0 && index< size)
    {
        Nodo *iterador = this->first;
        int x = 0;
        while(iterador != 0)
        {
            char stringsep[90];
            strcpy(stringsep2,iterador->getDato().c_str());

            if(stringsep[0] == stringsep2[0]){ return iterador->getDato();}
            iterador = iterador->getNext();
            x++;
        }
    }

}



#endif // LISTAARTISTA_H_INCLUDED
