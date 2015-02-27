**Rakennekuvaus**
Ohjelma sisältää kolme pakettia; Main, logiikka ja ui.

Main-paketti sisältää ainoastaan Main-luokan. Tämän luokan ainoa tarkoitus on käynnistää ohjelma.

Logiikka-paketti sisältää pelin logiikan toiminnallisuuden. Tämä sisältää kuusi luokkaa:
* Pelimoottori, joka pyörittää ohjelmaa. Pelimoottorissa pyöritetään sovelluslogiikkaa ja päivitetään
käyttöliittymän näkymää pelin pyöriessä.
* Sovelluslogiikka, joka hoitaa kirjaimellisesti ohjelman logiikan. Luokassa luodaan esteet ja maali,
liikutetaan hahmoa, esteitä ja maalia, ja tarkistetaan, törmäävätkö ne toisiinsa.
* Hahmo, joka sisältää hahmon sijainnin, koon, ja hoitaa hahmon hyppäämisen toiminnallisuuden.
* Maali, joka sisältää maalin sijainnin ja koon, ja hoitaa maalin liikkumisen.
* Este, joka sisältää esteen sijainnin ja koon, ja hoitaa esteen liikkumisen.
* Taso, joka sisältää listan esteistä, ja metodeita esteiden hoitamiseen (esim. luominen, getterit ja setterit).

Ui-paketti sisältää kaiken käyttöliittymään kuuluvan. Paketti sisältää kahdeksan luokkaa:
* Ui, joka hoitaa kaiken, jonka käyttäjä näkee ruudulla, paketin muiden luokkien avulla.
* Ikkuna, joka piirtää hahmon, esteet ja maalin ruudulle.
* HahmonAnimaatio, joka antaa Ikkuna-luokalle tiedon hahmon sijainnista joka hetkellä.
* MenuHiirenKuuntelija, joka hoitaa menun nappien toiminnallisuuden.
* OhjevalikkoHiirenKuuntelija, joka hoitaa ohjevalikon nappien toiminnallisuuden.
* NappaimistonKuuntelija, jossa hoidetaan se, että jos käyttäjä painaa välilyöntiä, hahmo hyppää.
* TasovalikkoHiirenKuuntelija, jossa hoidetaan tasovalikon nappien toiminnallisuus.
* PelinjalkeinenMenuHiirenKuuntelija, jossa hoidetaan pelinjälkeisen menun nappien toiminnallisuus.

Käytännössä Mainissa käynnistetään Ui. Ui puolestaan käynnistää pelimoottorin. 
Pelimoottori pyörittää logiikkaa ja päivittää Ui:ta. Logiikan pyöriminen toimii niin, että Sovelluslogiikka-luokka hoitaa 
kaiken käyttäen apunaan muita logiikka-paketin luokkia. 
Ui-luokka taas hoitaa kaiken käyttöliittymään liittyvän muiden ui-paketin luokkien avulla, jotka 
saattavat käyttää joitain logiikan luokkia.