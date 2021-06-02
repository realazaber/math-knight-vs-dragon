public class Main {
	public static void main(String[] args) {
		
		System.out.println("The dragon has 100 heads and \nthe knight can cut a certain \nammount off but new ones will \ngrow back.");
		System.out.println("============================");
		System.out.println("Options");
		System.out.println("Heads cut: 15. Heads grown 24");
		System.out.println("Heads cut: 17. Heads grown 2");
		System.out.println("Heads cut: 20. Heads grown 14");
		System.out.println("Heads cut: 5. Heads grown 17");
		System.out.println("============================");
		int _dragonHeads = 100;
		int _knightSwings;
		
		System.out.println("Option 1: ");
		_dragonHeads = 100;
		
		for (int i = 1; i < 10; i++) {
			_dragonHeads -= 15;
			_dragonHeads += 24;
			System.out.println(_dragonHeads + " dragon heads left. " + " Swing number " + i);
			if (_dragonHeads <= 0) {
				break;
			}
			
		}
		
		System.out.println("============================");
		
		System.out.println("Option 2: ");
		_dragonHeads = 100;
		for (int i = 1; i < 15; i++) {
			_dragonHeads -= 17;
			_dragonHeads += 2;
			System.out.println(_dragonHeads + " dragon heads left. " + " Swing number " + i);
			if (_dragonHeads <= 0) {
				break;
			}
			
		}
		
		System.out.println("============================");
		
		System.out.println("Option 3: ");
		_dragonHeads = 100;
		for (int i = 1; i < 20; i++) {
			_dragonHeads -= 20;
			_dragonHeads += 14;
			System.out.println(_dragonHeads + " dragon heads left. " + " Swing number " + i);
			if (_dragonHeads <= 0) {
				break;
			}
			
		}
		
		System.out.println("============================");
		
		System.out.println("Option 4: ");
		_dragonHeads = 100;
		for (int i = 1; i < 10; i++) {
			_dragonHeads -= 5;
			_dragonHeads += 17;
			System.out.println(_dragonHeads + " dragon heads left. " + " Swing number " + i);
			if (_dragonHeads <= 0) {
				break;
			}
			
		}
		
		System.out.println("============================");
		
	}
	

}
