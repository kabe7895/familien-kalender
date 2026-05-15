# ANA-E1 – Softwareanalyse (Ist-Analyse & Soll-Konzept)  
## Projekt: FamilyFlow – Intelligenter Familienkalender  
**Autor:** kb  

---

# 1. Produktdefinition (Visionsskizze)

FamilyFlow ist eine Software zur Unterstützung der Familienorganisation.  
Das Produkt dient zur zentralen Verwaltung von:

- Terminen
- Aufgaben
- Erinnerungen
- Verfügbarkeiten von Familienmitgliedern

Die Vision ist eine intelligente, leicht bedienbare Plattform, die den Familienalltag strukturiert und Konflikte in der Planung reduziert.

Die Visionsskizze dient als motivierende Grundlage für die spätere Entwicklung.

---

# 2. Ist-Analyse

## 2.1 Aktuelle Problemlage

In vielen Familien werden mehrere Tools parallel genutzt (Kalender-Apps, Notizen, Messenger). Dadurch entstehen:

- Informationsverluste
- doppelte Einträge
- Missverständnisse bei Terminen
- fehlende Übersicht über Verfügbarkeiten

---

## 2.2 Kommunikationsprobleme

Die fehlende zentrale Struktur führt zu schlechter Abstimmung zwischen Familienmitgliedern. Besonders bei getrennten Haushalten oder wechselnden Betreuungsmodellen entstehen Konflikte.

---

## 2.3 Bestehende Lösungen

Aktuelle Lösungen wie Google Calendar oder Apple Calendar sind zwar verbreitet, aber:

- nicht speziell auf Familienprozesse optimiert
- bieten keine Verfügbarkeitslogik
- haben keine intelligente Konfliktlösung

---

# 3. Soll-Konzept (Produktdefinition)

## 3.1 Zielsystem

FamilyFlow soll folgende Funktionen bereitstellen:

- zentraler Familienkalender
- Aufgabenmanagement
- Erinnerungen
- Verfügbarkeitsübersicht
- Rollen- und Rechteverwaltung

---

## 3.2 Erweiterte Soll-Funktionen

- automatische Konflikterkennung
- intelligente Terminoptimierung (KI)
- lernende Zeitplanung
- transparente Vorschlagslogik

---

## 3.3 Abgrenzung

Nicht Bestandteil des Systems:

- kein soziales Netzwerk
- keine Werbeplattform
- keine Business-Software
- keine unkontrollierte Automatisierung

---

# 4. Use-Case Analyse

## 4.1 Business Use-Cases

- Familienmitglied erstellt Termin
- Familie plant gemeinsamen Termin
- Eltern koordinieren Kindertermine
- System zeigt freie Zeiten aller Mitglieder

---

## 4.2 Funktionale Use-Cases

- UC1: Termin erstellen
- UC2: Termin verschieben
- UC3: Aufgabe zuweisen
- UC4: Verfügbarkeit anzeigen
- UC5: Erinnerung auslösen

---

# 5. Geschäftsprozessanalyse

Der Familienalltag wird als Prozess betrachtet:

- Termin entsteht
- Abstimmung zwischen Mitgliedern
- Eintragung in Kalender
- Erinnerung vor Termin
- Durchführung des Ereignisses

Diese Prozesse werden digital unterstützt und teilweise automatisiert.

---

# 6. Machbarkeitsanalyse (Durchführbarkeit)

## 6.1 Technische Machbarkeit

Das System ist realisierbar durch:

- React (Frontend)
- Node.js (Backend)
- PostgreSQL (Datenhaltung)
- FastAPI (KI-Komponente)

---

## 6.2 Risiken

- Datenschutz (DSGVO)
- Komplexität der KI
- Synchronisationsfehler
- Nutzerakzeptanz

---

### 6.2.1 Risikokategorie nach EU AI Act

Das System wird eingeordnet als:

#### „Minimal bis begrenztes Risiko mit potenziellen High-Risk-Teilfunktionen“

Begründung:

- Keine biometrische Identifikation
- Keine sicherheitskritischen Entscheidungen
- Keine medizinische oder rechtliche Anwendung
- KI dient nur als Entscheidungshilfe (Human-in-the-loop)

---

#### 6.2.1.1 KI-Risiken im System

- mögliche falsche Planungsvorschläge
- fehlerhafte Zeitprognosen
- Überoptimierung von Terminen

---

#### 6.2.1.2 Anforderungen aus EU AI Act Perspektive

- Transparenz der KI-Entscheidungen
- erklärbare Vorschläge
- Nutzer muss alle Änderungen bestätigen
- keine autonome Entscheidungsdurchsetzung
- Protokollierung von KI-Vorschlägen

---

## 6.3 Prototypfähigkeit

Ein erster Prototyp (MVP) ist schnell realisierbar und dient zur Validierung der Grundfunktionen.

---

# 7. Qualitätssicherung

- Validierung von Terminen
- Konfliktprüfung
- UI-Tests durch Prototypen
- Nutzerfeedback aus Pilotfamilie

Ziel ist eine stabile, fehlerarme Basisversion.

---

# 8. Glossar

- **Termin:** zeitlich definierter Eintrag im Kalender  
- **Verfügbarkeit:** freie Zeit eines Familienmitglieds  
- **Konflikt:** Überschneidung von Terminen  
- **Use-Case:** konkreter Anwendungsfall im System  
- **MVP:** Minimal funktionsfähiges Produkt  

---

# 9. Fazit der Analyse

FamilyFlow zeigt klare Anforderungen aus der Ist-Situation und definiert ein Soll-System mit erweiterten intelligenten Funktionen.

Die wichtigste Verbesserung gegenüber bestehenden Systemen ist die Kombination aus:

- Familienzentrierter Struktur
- Verfügbarkeitslogik
- optionaler KI-Unterstützung

FamilyFlow fällt nicht unter verbotene KI-Systeme, benötigt jedoch:

- Transparenzmechanismen
- Benutzerkontrolle
- nachvollziehbare Entscheidungslogik