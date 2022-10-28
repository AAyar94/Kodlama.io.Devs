package com.kodlamaIioDevs.Kodlama.io.Devs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
* Req 1 : Sistemde programlama dilleri tutulmalıdır.

Programlama dillerini(C#,Java,Python) ekleyebilecek, silebilecek, güncelleyebilecek, listeleyebilecek, id ile getirebilecek kodları yazınız. Bunu tamamen in memory yapınız.
İsimler tekrar edemez.
Programlama dili boş geçilemez. (Validation kullanmadan, kod yazarak algoritmik çözünüz)

* */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
