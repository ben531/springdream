package fzgg;

public interface IntegerTest {
	static void test1() {
		System.out.println("test1");
	}

	default void test2() {
		System.out.println("test2");
	}
}
