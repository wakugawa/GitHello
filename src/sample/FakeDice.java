package sample;

public class FakeDice implements DiceIF {
	 int[] values = new int[] {
		        3, 4, 2, 1, 5, 6
		    };
		    int current = 0;
	 
	public int roll() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		 current++;
	        if (current == 6) current = 0;
	        return values[current];
	}

}
