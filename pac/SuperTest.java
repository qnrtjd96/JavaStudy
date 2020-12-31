package pac;

class SuperTest {
	int a;
	SuperTest(int a) {
		this.a=a;
	}
}
	class SubTest extends SuperTest{
		public SubTest(int a) {super(a);}
		public SubTest(){super(10);}
	}

