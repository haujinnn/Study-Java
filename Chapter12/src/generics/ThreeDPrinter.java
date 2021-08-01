package generics;

public class ThreeDPrinter<T extends Material> { //���׸� Ŭ���� ǥ���� ���� <T>

	private T material; //� Ÿ���� �������� ���� object�� ����ȯ

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
