package PuntoSieteOcho;

import java.util.Scanner;

public class Main {
	private final static Scanner sc = new Scanner(System.in); 

	int suitNumber = 0;
	int faceNumber = 0;
	Main() {

		Hand hand = new Hand();
		Card[] card = null;

		generateRandomNumCard();
		hand.addCard(new Card(suitNumber, faceNumber));
		
		generateRandomNumCard();
		hand.addCard(new Card(suitNumber, faceNumber));
		
		card = hand.getCardArray();
		System.out.println(" -" + card[0]);
		System.out.println(" -" + card[1]);

		int pointCardOne = card[0].getPoints(card[0].name);
		int pointCardTwo = card[1].getPoints(card[1].name);
		int pointsCards = pointCardOne + pointCardTwo;
		System.out.println("El total de las dos cartas (" + card[0] + " y " + card[1] +") es " + pointsCards + ".");

		while(!(hand.getIsBusted() || hand.getIsFullHand())){
			System.out.println("================================");
			System.out.print("¿Quieres tomar otra carta? (y/n) ");
			String respuesta = sc.nextLine();
			respuesta = respuesta.substring(0, 1);

			if(respuesta.equalsIgnoreCase("y")){
				generateRandomNumCard();
				hand.addCard(new Card(suitNumber, faceNumber));
				int lastCardPosition = hand.getCards() - 1;
				System.out.println(">> Se agrego la \"" + card[lastCardPosition] + "\" carta a la baraja.");
				pointsCards += card[lastCardPosition].getPoints(card[lastCardPosition].name);
				System.out.println("El total de las cartas es " + pointsCards + ".");
			}else{
				System.out.println("El total de las cartas es " + pointsCards + ".");
				break;
			}
		}

		System.out.println("=====================");
		System.out.println(hand.toString());
	}
	private void generateRandomNumCard() {
		int suitNumberMax = 4;
		int faceNumberMax = 13;

		setSuitNumber((int) (Math.random() * suitNumberMax + 1));
		setFaceNumber((int) (Math.random() * faceNumberMax + 1));
	}

	public void setSuitNumber(int suitNumber) {
		this.suitNumber = suitNumber;
	}

	public int getSuitNumber() {
		return suitNumber;
	}

	public void setFaceNumber(int faceNumber) {
		this.faceNumber = faceNumber;
	}

	public int getFaceNumber() {
		return faceNumber;
	}

}
