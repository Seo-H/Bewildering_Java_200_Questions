package Chap13;

//--- °³ Å¬·¡½º (Ver.1) ---//
class Dog extends Animal {
	private String type; // °³ÀÇ Á¾·ù

	public Dog(String name, String type) { // »ý¼ºÀÚ
		super(name);
		this.type = type;
	}

	public void bark() {
		System.out.println("¸Û¸Û!");
	} // Â¢±â
}