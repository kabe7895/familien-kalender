\# Einsendeaufgabe DVC-E1 – Versionsverwaltung mit Git - KarstenBernhardt



\## 1. Repository



Mein GitHub Repository:



https://github.com/kabe7895/familien-kalender



Dieses Repository ist öffentlich (public).



\---



\## 2. Projekt



Für die Aufgabe wurde ein eigenes GitHub-Repository verwendet und lokal geklont.



Verwendeter Befehl:



```bash

git clone https://github.com/kabe7895/familien-kalender.git

```



\---



\## 3. Verwendete Git-Befehle



Folgende Git-Kommandos habe ich im Projekt angewendet:



\- git clone

\- git status

\- git add

\- git diff

\- git diff --staged

\- git commit

\- git push

\- git pull

\- git mv

\- git rm

\- git log --oneline

\- git checkout

\- git checkout -b

\- git merge



\---



\## 4. Arbeiten mit Dateien



\### Datei erstellt



```bash

echo "Übung ESA2 SWT" > aufgabe.txt

git add aufgabe.txt

git commit -m "Meine neue Datei für die ESA 2 in SWT -Datei erstellt"

git push

```

!\[Git Push](screenshots/3\_git push.png)



\### Datei umbenannt



```bash

git mv aufgabe.txt aufgabe-neu.txt

git commit -m "Dateiname geändert mit git mv"

git push

```

!\[Git mv](screenshots/4\_git mv.png)



\### Zweite Datei erstellt



```bash

echo "Zweite Datei" > NeueDatei.txt

git add NeueDatei.txt

git commit -m "Zweite Datei erstellt"

git push

```



\### Datei gelöscht



```bash

git rm aufgabe-neu.txt

git commit -m "Erste Datei gelöscht"

git push

```

!\[Git rm](screenshots/5\_git rm.png)



\---



\## 5. Arbeiten mit Status und Diff



\### Status prüfen



```bash

git status

```

!\[Git Status](screenshots/1\_git status.png)



\### Änderungen anzeigen



```bash

git diff

git diff --staged

```

!\[Git Diff --staged](screenshots/2\_git diff --staged.png)



Dabei wurden Änderungen vor dem Commit überprüft.



\---



\## 6. Zeitreisen mit Git



Die Commit-Historie wurde mit folgendem Befehl angezeigt:



```bash

git log --oneline

```

!\[Beginn der Zeitreise](screenshots/6\_Beginn der Zeitreise.png)



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

!\[Git Checkout](screenshots/6\_git checkout fdf0b6c.png)



Danach erfolgte die Rückkehr zum aktuellen Stand:



```bash

git checkout main

```

!\[Git Checkout Main](screenshots/7.\_git checkout main.png)



\---



\## 7. Branches



Es wurden zwei ähnliche Branches erstellt:



\- feature-a

\- feature-b



\### Branch feature-a



```bash

git checkout -b feature-a

```





Datei erstellt:



```bash

echo "Feature A" > branch.txt

```

!\[Feature A Branch](screenshots/8\_git new branch für feature a.png)





Danach:



```bash

git add .

git commit -m "Feature A in neuem Branch erstellt"

git push --set-upstream origin feature-a

```



!\[GitHub Branches](screenshots/9\_github branches.png)



\---



\### Branch feature-b



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

!\[Feature B Branch](screenshots/10\_git branch 'b'.png)



\---



\## 8. Merge und Konfliktlösung



Zunächst wurde `feature-a` erfolgreich gemerged:



```bash

git merge feature-a

```

!\[Merge Feature A](screenshots/11\_git branche a into main.png)



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

!\[Push nach Merge](screenshots/12\_git push after merge and clear.png)



\---



\## 9. Pull Request auf GitHub



Zusätzlich wurde ein Pull Request im offiziellen Repository erstellt:



https://github.com/edlich/education



Der Pull Request wurde direkt über die GitHub-Weboberfläche erstellt (nicht über die Shell).



Beitrag:

\- kleine humorvolle Ergänzung / IT-Witze



Pull Request Link:



https://github.com/edlich/education/pull/598



Pull Request: 3 IT-ler Witze ergänzt #598



\## 10. Fazit



Im Rahmen der Aufgabe wurden die grundlegenden Funktionen von Git praktisch angewendet:



\- Arbeiten mit lokalen und Remote-Repositories

\- Versionierung

\- Branching

\- Merging

\- Konfliktlösung

\- Navigation durch ältere Projektstände

\- Arbeiten mit GitHub und Pull Requests

