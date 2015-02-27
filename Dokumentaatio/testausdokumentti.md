**Testausdokumentti**
En testannut automaattisesti:
* Käyttöliittymäpaketin luokkia, koska niiden testausta ei ole käyty läpi vielä millään kurssilla. 
Testasin niitä kuitenkin käsin, esimerkiksi vaihtamalla ikkunoiden kokoja, tekstejä, jne. saadakseni haluamani lopputuloksen.
* Pelimoottoria, koska pelimoottori kutsuu ainoastaan kolmea metodia; 
	* logiikan kaynnissa()-metodia, jota testataan logiikan testeissä,
	* käyttöliittymän piirra()-metodia, jota testasin käsin luodessani käyttöliittymää, ja 
	* pelimoottorin omaa odota()-metodia, joka sisältää try-catch rakenteen mahdollisia virheitä varten.
Automaattisissa testeissä testasin lähinnä, että kaikki konstruktorit, getterit ja setterit toimivat. 
Testasin myös satunnaisia muita metodeita, joista suurin osa on sovelluslogiikassa. Näissä testaan, että kaikki tärkeimmät 
toiminnot toimivat halutulla tavalla, esimerkiksi hahmon törmääminen esteeseen tai maaliin. 