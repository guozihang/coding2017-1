package cc.gzhlaker;

public interface List<T>{
	public void add(T data);
	public void add(T data,int index);
	public void addFirst(T data);
	public void remove(int index);
	public void removeFirst();
	public void removeEnd();
	public void setData(T data,int index);
	public int size();
	public T getData(int index);
	public T getMember(int index);
}
