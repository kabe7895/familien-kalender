# Tech Stack – FamilyFlow

## Überblick

FamilyFlow wird als mobile-first Webanwendung entwickelt, die später optional auf weitere Plattformen (Desktop / ggf. native Apps) erweitert werden kann.

Der Fokus liegt auf einer klaren Trennung zwischen Frontend, Backend und KI-Modulen sowie einer skalierbaren Architektur.

---

## Frontend (Client)

### Technologie

- React (Mobile-first Web UI)
- Responsive Design (Smartphone priorisiert)
- später erweiterbar auf Desktop-Ansicht

### Begründung

React ermöglicht eine komponentenbasierte, flexible und gut skalierbare Benutzeroberfläche. Der Mobile-first-Ansatz stellt sicher, dass die Anwendung primär für den Familienalltag unterwegs optimiert ist.

---

## Backend (Core System)

### Technologie

- Node.js (TypeScript empfohlen)

### Aufgaben

- API für Kalender- und Aufgabenlogik
- Benutzer- und Familienverwaltung
- Synchronisation zwischen Geräten
- Datenverarbeitung und Business-Logik

### Begründung

Node.js bietet eine gute Performance für Echtzeit-Synchronisation und ist gut mit modernen Frontend-Frameworks kombinierbar.

---

## Datenbank

### Technologie

- PostgreSQL

### Einsatz

- Speicherung von:
  - Familienmitgliedern
  - Terminen
  - Aufgaben
  - Verfügbarkeiten
  - Erinnerungen

### Begründung

PostgreSQL bietet eine stabile, relationale Struktur und ist sehr gut geeignet für komplexe Beziehungen (z. B. Familien → Mitglieder → Termine).

---

## Authentifizierung (Login-System)

### Strategie

Kein eigenes komplexes Identity-System wird entwickelt.

Stattdessen wird ein externer Auth-Service integriert.

### Mögliche Lösungen

- Auth0 (professionell, sehr flexibel)
- Firebase Authentication (einfacher Einstieg)
- Supabase Auth (PostgreSQL-nah, sehr passend zum Stack)
- Clerk (moderne UI + Auth out-of-the-box)

### Entscheidung

Die Authentifizierung ist **keine Kernkompetenz von FamilyFlow** und wird bewusst ausgelagert, um Fokus auf die Kernlogik zu legen.

---

## KI- & Automatisierungsmodul

### Technologie

- Python
- FastAPI

### Aufgaben

- Analyse von Zeit- und Terminmustern
- Konflikterkennung
- Vorschläge für Tagesplanung
- Lernende Optimierung von Zeitbedarfen
- später mögliche Integration von LLMs / KI-Modellen

### Begründung

Python ist ideal für Datenanalyse und KI-Logik. FastAPI ermöglicht eine schnelle und moderne API-Anbindung an das Hauptsystem.

---

## Architekturprinzipien

- Mobile-first Design
- klare Trennung von Frontend / Backend / KI
- modulare Erweiterbarkeit
- API-first Ansatz
- skalierbare Datenstruktur
- Datenschutzorientiertes Design

---

## Langfristige Erweiterbarkeit

Die Architektur ist so ausgelegt, dass später möglich ist:

- native Mobile Apps (z. B. React Native)
- Smart-Home Integration
- KI-gestützte Automatisierung
- Multi-Familien-Plattform (SaaS)