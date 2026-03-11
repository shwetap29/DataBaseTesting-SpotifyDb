# 🎵 Database Testing — Spotify Database

> A hands-on learning project exploring database testing concepts using a Spotify-inspired database schema — covering SQL validation, data integrity checks, and structured test case design.

---

## 📌 Project Overview

This project was built as part of my early journey into **QA Engineering and database validation**. Using a Spotify-style relational database (artists, albums, tracks, playlists, users), I designed and executed a series of database tests to validate data integrity, referential constraints, and query accuracy.

**Honest framing:** This is a learning project from my QA phase — it reflects where I started before transitioning into Business Analysis and Data Analytics. I'm keeping it public because the structured testing mindset it demonstrates still underlies how I approach data quality today.

---

## 🎯 What This Project Covers

- Designing structured test cases for a relational database
- Writing SQL queries to validate data integrity rules
- Checking referential integrity (foreign key relationships)
- Testing boundary conditions and null handling
- Documenting test scenarios and expected vs. actual results

---

## 🗃️ Database Schema (Spotify-Inspired)

```
Artists       ← artist_id, name, genre, country
Albums        ← album_id, artist_id, title, release_year
Tracks        ← track_id, album_id, title, duration, play_count
Playlists     ← playlist_id, user_id, name, created_date
PlaylistTracks← playlist_id, track_id (junction table)
Users         ← user_id, username, subscription_type
```

---

## 🧪 Test Cases Covered

| Test Type | Description |
|---|---|
| Data Integrity | Validate no orphan records exist across related tables |
| Null Checks | Ensure required fields are never null |
| Referential Integrity | Confirm foreign key relationships are enforced |
| Boundary Testing | Test min/max values for duration, play count |
| Query Validation | Verify aggregate queries return expected results |
| Duplicate Detection | Identify duplicate track or artist entries |

---

## 🛠️ Tools & Tech Stack

| Tool | Purpose |
|---|---|
| `SQL` | Query writing and data validation |
| `HTML` | Test documentation formatting |
| Relational DB concepts | Schema design and integrity testing |

---

## 💡 Skills Demonstrated

`Database Testing` · `SQL Query Writing` · `Data Validation` · `Test Case Design` · `Referential Integrity` · `QA Mindset` · `Structured Documentation` · `Defect Identification`

---

## 📝 What I Learned

- How to systematically design test cases for a relational database
- The importance of data integrity rules in preventing downstream reporting errors
- How QA thinking directly supports BA work — especially in UAT and data reconciliation

---
