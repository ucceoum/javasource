package basic;

public class Value {
	
	private int value;
	
	
	public Value(int value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return value+"";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
