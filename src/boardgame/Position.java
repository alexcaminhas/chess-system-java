package boardgame;

public class Position {
	
	private Integer row;
	private Integer column;
	
	public Position() {
		
	}

	public Position(Integer rowInteger, Integer column) {
		this.row = rowInteger;
		this.column = column;
	}

	public Integer getRowInteger() {
		return row;
	}

	public void setRowInteger(Integer rowInteger) {
		this.row = rowInteger;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return this.row +", "+this.column;
	}

}
