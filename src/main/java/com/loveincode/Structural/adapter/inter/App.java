package com.loveincode.Structural.adapter.inter;

public class App {

	public static void main(String[] args) {
		Target adapter1 = new Adapter1();
		adapter1.request();
		adapter1.specificRequest();

        Target adapter2 = new Adapter2();
        adapter2.request();
        adapter2.specificRequest();
	}

}
