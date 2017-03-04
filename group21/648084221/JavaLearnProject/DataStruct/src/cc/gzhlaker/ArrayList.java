package cc.gzhlaker;

public class ArrayList<T> implements List<T> {
	// ------------------------------
	// -私有成员变量
	// ------------------------------
	private int size;
	private Object[] array;

	// ------------------------------
	// -构造函数
	// -默认构造函数会初始化数组为100
	// -有参数的构造函数会有一个参数，用来初始化数组的长度
	// ------------------------------
	public ArrayList() {
		size = 0;
		array = new Object[100];
	}

	public ArrayList(int length) {
		size = 0;
		array = new Object[length];
	}

	// ------------------------------
	// -length从0开始，所以需要和size比较时加1
	// -size不用加1，检测当前值如果与length相等则空间必定不够
	// ------------------------------
	public boolean isFill(int size, int length) {
		if (size >= length + 1) {
			return true;
		} else if (size < length + 1) {
			return false;
		}
		return false;
	}

	// ------------------------------
	// -每次扩大10的空间
	// ------------------------------
	public Object[] increaseLength(Object[] array) {
		Object[] newarray = new Object[array.length + 10];
		System.arraycopy(array, 0, newarray, 0, array.length);
		return newarray;
	}
	
	public void find(int index){
		
	}
	
	public void find(Object object){
		
	}

	@Override
	// ------------------------------
	// -先检测空间是否够
	//
	//
	public void add(T data) {
		if (isFill(size + 1, array.length)) {
			array = increaseLength(array);
		}
		array[size] = data;
		size++;
	}

	@Override
	// -
	public void add(T data, int index) {
		if (isFill(size, array.length)) {
			array = increaseLength(array);
		}
		for (int i = size + 1; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = data;
		size++;
	}

	@Override
	public void addFirst(T data) {
		if (isFill(size, array.length)) {
			array = increaseLength(array);
		}
		for (int i = size + 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = data;
		size++;
	}

	@Override
	public void remove(int index) {
		for (int i = index; i <= index; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}

	@Override
	public void removeFirst() {

		for (int i = 1; i < size - 1; i++) {
			array[i - 1] = array[i];
		}
	}

	@Override
	public void removeEnd() {

	}

	@Override
	public void setData(int data, int index) {
		if (index > now.length) {
			return;
		}
		now[index].number = data;

	}

	@Override
	public void setData(T data, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T getData(int index) {
		

		return null;
	}

	@Override
	public T getMember(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
