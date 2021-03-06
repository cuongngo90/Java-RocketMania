
public class PlusTile extends Tile{

	public PlusTile(){
		this.up = true;
		this.down = true;
		this.left = true;
		this.right = true;
		this.fuel=false;
	}
	
	public void rotate() {
		// has no effect as plus tile connects in
		// every direction
	}

	
	public Tile[] getAdjacent(Tile[][] gameBoard){
			
		Tile[] t = new Tile[4];
		int head=0;
		for(int i=0;i<4;i++){
			t[i]=null;
		}
		
		// conditions make sure that we don't go out of the 
		// bounds of the game board.
		if(x<7){
			t[head] = gameBoard[y][x+1];
			head++;
		}
		
		if(x>0){
			t[head] = gameBoard[y][x-1];
			head++;
		}
		
		if(y<8){
			t[head] = gameBoard[y+1][x];
			head++;
		}
		
		if(y>0){
			t[head] = gameBoard[y-1][x];
			head++;
		}
		
		
		return t;
		
	}

	public void setX(int x) {
		this.x = x;
		
	}

	public void setY(int y) {
		this.y = y;
		
	}
	
}

