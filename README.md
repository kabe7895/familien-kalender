# Einsendeaufgabe DVC-E1 – Versionsverwaltung mit Git - KarstenBernhardt



## 1. Repository



Mein GitHub Repository:



https://github.com/kabe7895/familien-kalender



Dieses Repository ist öffentlich (public).



---



## 2. Projekt



Für die Aufgabe wurde ein eigenes GitHub-Repository verwendet und lokal geklont.



Verwendeter Befehl:



```bash

git clone https://github.com/kabe7895/familien-kalender.git

```



---


## 3. Verwendete Git-Befehle



Folgende Git-Kommandos habe ich im Projekt angewendet:



- git clone

- git status

- git add

- git diff

- git diff --staged

- git commit

- git push

- git pull

- git mv

- git rm

- git log --oneline

- git checkout

- git checkout -b

- git merge



---



## 4. Arbeiten mit Dateien



### Datei erstellt



```bash

echo "Übung ESA2 SWT" > aufgabe.txt

git add aufgabe.txt

git commit -m "Meine neue Datei für die ESA 2 in SWT -Datei erstellt"

git push

```

![Git Push](screenshots/03\_git-push.png)



### Datei umbenannt



```bash

git mv aufgabe.txt aufgabe-neu.txt

git commit -m "Dateiname geändert mit git mv"

git push

```

![Git mv](screenshots/04\_git-mv.png)



### Zweite Datei erstellt



```bash

echo "Zweite Datei" > NeueDatei.txt

git add NeueDatei.txt

git commit -m "Zweite Datei erstellt"

git push

```



### Datei gelöscht



```bash

git rm aufgabe-neu.txt

git commit -m "Erste Datei gelöscht"

git push

```

![Git rm](screenshots/05\_git-rm.png)



---



## 5. Arbeiten mit Status und Diff


### Status prüfen



```bash

git status

```

![Git Status](screenshots/01\_git-status.png)



### Änderungen anzeigen



```bash

git diff

git diff --staged

```

![Git Diff](screenshots/02\_git-diff-staged.png)

Dabei wurden Änderungen vor dem Commit überprüft.



---



## 6. Zeitreisen mit Git



Die Commit-Historie wurde mit folgendem Befehl angezeigt:



```bash

git log --oneline

```

![Zeitreise](screenshots/06\_zeitreise-start.png)



Beispielhafte Commits:



```text

e83e31b Erste Datei gelöscht

f712443 Zweite Datei erstellt

fdf0b6c Dateiname geändert mit git mv

d793398 Meine neue Datei für die ESA 2 in SWT -Datei erstellt

```



Anschließend wurde ein älterer Commit ausgecheckt:



```bash

git checkout fdf0b6c

```

![Checkout Old](screenshots/07\_checkout-oldcommit.png)



Danach erfolgte die Rückkehr zum aktuellen Stand:



```bash

git checkout main

```

![Checkout Main](screenshots/08\_checkout-main.png)

---



## 7. Branches



Es wurden zwei ähnliche Branches erstellt:



- feature-a

- feature-b



### Branch feature-a



```bash

git checkout -b feature-a

```





Datei erstellt:



```bash

echo "Feature A" > branch.txt

```

![Feature A](screenshots/09\_feature-a-branch.png)





Danach:



```bash

git add .

git commit -m "Feature A in neuem Branch erstellt"

git push --set-upstream origin feature-a

```



![Branches](screenshots/10\_branches.png)

---



### Branch feature-b



```bash

git checkout -b feature-b

```



Datei erstellt:



```bash

echo "Feature B" > branch.txt

```



Danach:



```bash

git add .

git commit -m "Feature B in neuem Branch 'b' erstellt"

git push --set-upstream origin feature-b

```

![Feature B](screenshots/11\_feature-b-branch.png)

---



## 8. Merge und Konfliktlösung



Zunächst wurde `feature-a` erfolgreich gemerged:



```bash

git merge feature-a

```

![Merge A](screenshots/12\_merge-feature-a.png)



Anschließend wurde `feature-b` gemerged:



```bash

git merge feature-b

```



Dabei entstand ein Merge-Konflikt:



```text

CONFLICT (add/add): Merge conflict in branch.txt

```



Der Konflikt wurde bereinigt und anschließend committed:



```bash

git add branch.txt

git commit -m "Merge feature-a into main"

git push

```

![Merge Push](screenshots/13\_merge-push.png)

---



## 9. Pull Request auf GitHub



Zusätzlich wurde ein Pull Request im offiziellen Repository erstellt:



https://github.com/edlich/education



Der Pull Request wurde direkt über die GitHub-Weboberfläche erstellt (nicht über die Shell).



Beitrag:

- kleine humorvolle Ergänzung / IT-Witze



Pull Request Link:



https://github.com/edlich/education/pull/598



Pull Request: 3 IT-ler Witze ergänzt #598



## 10. Fazit



Im Rahmen der Aufgabe wurden die grundlegenden Funktionen von Git praktisch angewendet:



- Arbeiten mit lokalen und Remote-Repositories

- Versionierung

- Branching

- Merging

- Konfliktlösung

- Navigation durch ältere Projektstände

- Arbeiten mit GitHub und Pull Requests

