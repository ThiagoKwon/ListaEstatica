package lista.estatica.pacote;

public class Lista<T> {

	private T[] data;
	private int size;

	@SuppressWarnings("unchecked")
	public Lista(int size) {
		setData((T[]) new Object[size]);
		setSize(size);
	}

	public void add(T data) {
		if (isFull()) {
			throw new IllegalAccessError("Fila cheia!");
		}
		for (int i = 0; i < getData().length; i++) {
			if (getData()[i] == null) {
				getData()[i] = data;
				break;
			}
		}
	}

	public void add(T data, int position) {
		if (isFull()) {
			throw new IllegalAccessError("Fila cheia!");
		}
		getData()[position] = data;
	}

	public void clear() {
		for (int i = 0; i < getData().length; i++) {
			getData()[i] = null;
		}
	}

	public T remove(int position) {
		T retorno = getData()[position];
		getData()[position] = null;
		return retorno;
	}

	public boolean isEmpty() {
		return getData()[0] == null;
	}

	public boolean isFull() {
		for (int i = 0; i < getData().length; i++) {
			if (getData()[i] == null) {
				return false;
			}
		}
		return true;
	}

	public void setData(T data, int position) {
		getData()[position] = data;
	}

	public T getData(int position) {
		return getData()[position];
	}

	public int getListSize() {
		int qttData = 0;
		for (int i = 0; i < getData().length; i++) {
			if (getData()[i] != null) {
				qttData++;
			}
		}
		return qttData;
	}

	public int findByData(T data) {
		int index = -1;
		for (int i = 0; i < getData().length; i++) {
			if (getData()[i] == data) {
				index = i;
			}
		}
		return index;
	}

	public void showList() {
		for (int i = 0; i < getData().length; i++) {
			System.out.println(getData()[i]);
		}
	}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=--=-=-=-=-=-=-=-=-=-
	public T[] getData() {
		return data;
	}

	public void setData(T[] data) {
		this.data = data;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
