package sample;

public class RealDice implements DiceIF {
 java.util.Random r = new java.util.Random();
	    int maxNum = 6;
	
	
	public int roll() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return r.nextInt(maxNum) + 1;
	}

}
