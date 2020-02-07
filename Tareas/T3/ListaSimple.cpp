#include <iostream>
using namespace std;

class Nodo {

private:
	int carnet;
	string name;
	Nodo *next;

public:
	Nodo(int carnet_, string nombre_) {

		carnet = carnet_;
		name = nombre_;

	}

	int getCarnet() { return carnet; }
	string getName() { return name; }
	Nodo *getNext() { return next; }

	void setName(string nombre) { name = nombre; }
	void setCarnet(int carnet_) { carnet = carnet_; }
	void setNext(Nodo *next_) { next = next_; }

};

class ListaSimple {

private:
	Nodo *first;
public:

	void prepend(int carnet_, string nombre_) {

		Nodo *nuevo = new Nodo(carnet_, nombre_);// guardo en memoria el nodo

		nuevo->setCarnet(carnet_);
		nuevo->setName(nombre_);

		nuevo->setNext(first); //hago q el siguiente de nuevo se el primero
		this->first = nuevo; // el apuntador primero apunta a nuevo;

	}

	Nodo *search(char i) {
	
		Nodo *aux = this->first;

		while (aux != 0)
		{

			if (aux->getName()[0] == i)
			{
				return aux;
			}
			else {
				aux = aux->getNext();
			}
			
		}

		throw new exception("No se encuentra su busqueda");

	}

	void delate(Nodo *nodo) {

		Nodo *aux = this->first;

		while (aux->getNext() != 0) 
		{
			
			if (aux->getNext() == nodo)
				break;
			aux = aux->getNext();


		}

		if (aux->getNext() == 0)
		{
			throw new exception("Nodo no encontrado en la lista");
		} 
		else 
		{
			
			aux->setNext(aux->getNext()->getNext());
			aux->getNext()->setNext(0);
			delete aux;
		}

	} //fin eliminar

};


