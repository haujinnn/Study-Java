package generics;

public class ThreeDPrinter<T extends Material> { //제네릭 클래스 표시할 곳에 <T>

	private T material; //어떤 타입이 들어오든지 간에 object로 형변환

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
