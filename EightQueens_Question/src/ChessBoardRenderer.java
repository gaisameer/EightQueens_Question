public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		int row = (int)(square / 8);
		if(row % 2 == 0 && square % 2 ==1 || row % 2 == 1 && square % 2 == 0)
			return true;
		//System.out.println(square);
		return false;
	}
}
