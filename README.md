# Egyszámjáték

Az egyszámjáték Mérő László matematikus találmánya. A játék nagyon egyszerű. Mindenkinek, aki a játék egy fordulójában részt kíván venni, tippelnie kell egy számra 1 és 99 között. A játékot az nyeri, aki a legkisebb olyan számra tippelt, amelyre csak ő tippelt egyedül, ha nincs ilyen szám, akkor a fordulónak nincs nyertese. Ebben a feladatban egy többfordulós egyszámjátékkal kapcsolatban kell feladatokat
megoldania.

A megoldás során vegye figyelembe a következőket:

- *A képernyőre írást igénylő részfeladatok eredményének megjelenítése előtt írja a képernyőre a feladat sorszámát (például: 3. feladat: )!*
- *Az egyes feladatokban a kiírásokat a minta szerint készítse el!*
- *Az ékezetmentes kiírás is elfogadott.*
- *A program megírásakor a fájlban lévő adatok helyes szerkezetét nem kell ellenőriznie, feltételezheti, hogy a rendelkezésre álló adatok a leírtaknak megfelelnek.*
- *A megoldását úgy készítse el, hogy az azonos szerkezetű, de tetszőleges bemeneti adatok mellett is helyes eredményt adjon!*



Az **egyszamjatek.txt** állomány soronként tartalmazza a játékban részt vevő játékosok nevét és a fordulónként leadott tippjeit. A játékosok és a fordulók száma 5−közötti lehet. A tippek 1−99 közötti egész számok lehetnek. Az adatokat a szóköz karakter választja el egymástól. Az állományban nincs két egyforma nevű játékos.

Például: 

```txt
  3 12 1 8 5 8 1 2 1 4 Marci
```

A példában látható, hogy Marci tippjei a játék 10 fordulójában rendre *3 12 1 8 5 8 1 2 1 4* voltak.



1. Készítsen programot a következő feladatok megoldására, amelynek a forráskódját
   egyszamjatek néven mentse el!
2. Olvassa be az egyszamjatek.txt állományban lévő adatokat és tárolja el egy olyan
   adatszerkezetben, ami a további feladatok megoldására alkalmas!
3. Határozza meg és írja ki a képernyőre a minta szerint, hogy a játékban hány játékos vett
   részt!
4. Határozza meg és írja ki a képernyőre a minta szerint, hogy a játékban hány fordulót
   játszottak a játékosok! Feltételezheti, hogy minden játékos minden fordulóban részt vett.
5. Döntse el és írja ki a képernyőre a minták szerint, hogy az első fordulóban tippelt-e valaki
   az 1-es számra!
6. Határozza meg és írja ki a minta szerint, hogy a fordulók során melyik volt a legnagyobb
   tipp!
7. Kérje be egy forduló sorszámát! Az adatbevitel előtt jelenjen meg a lehetséges legkisebb és legnagyobb fordulószám értéke! Például: „7. feladat: Kérem a forduló sorszámát [1−10]:” (Ebben az esetben 10 db forduló volt az *egyszamjatek.txt* állományban.) Ha a beadott sorszám nem felel meg a lehetséges értékeknek, akkor az fordulóval dolgozzon a következő feladatokban! 
8. Az előző feladatban bekért fordulóban határozza meg és írja ki a minta szerint a nyertes tipp értékét! Ha nem volt nyertes tipp a vizsgált fordulóban, akkor a „Nem volt egyedi tipp a megadott fordulóban!” szöveget jelenítse meg!
9. A 7. feladatban bekért fordulóban határozza meg és írja ki a minta szerint a nyertes játékos nevét! Ha nem volt nyertes a megadott fordulóban, akkor a „**Nem volt nyertes a megadott fordulóban!**” szöveget jelenítse meg!
10. Ha volt nyertes a 7. feladatban megadott fordulóban, akkor a minta szerint írja ki a nyertes
    forduló adatait a *nyertes.txt* állományba!



### Minta a feladathoz:

```txt
  3. feladat: Játékosok száma: 9
  4. feladat: Fordulók száma: 10
  5. feladat: Az első fordulóban volt egyes tipp!
  6. feladat: A lenagyobb tipp a fordulók során: 13
  7. feladat: Kérem a forduló sorszámát [1-10]: 3
  8. feladat: A nyertes tipp a megadott fordulóban: 3
  9. feladat: A megadott forduló nyertese: Andi
```



### Minta a nyertes.txt állományhoz:

```txt
  Forduló sorszáma: 2.
  Nyertes tipp: 3
  Nyertes játékos: Tibi
```

