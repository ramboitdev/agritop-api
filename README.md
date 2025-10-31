# 🌱 AgriSense API

**AgriSense API** est le backend principal du système **AgriSense**, une plateforme intelligente de gestion agricole à Madagascar.  
Elle centralise les informations sur les **semences, produits agricoles** et les **caractéristiques climatiques régionales**, tout en intégrant des **modules d’intelligence artificielle** pour l’analyse et la prédiction des productions.

---

## 🚀 Fonctionnalités principales

- **🔍 Recherche de semences et produits agricoles**  
  Permet la recherche avancée par type, climat adapté, région ou cycle de culture.

- **📦 Enregistrement et gestion des produits**  
  Gestion CRUD complète des produits agricoles avec détails (variété, besoins, rendement, sol adapté, etc.).

- **🌍 Gestion des cultures par région**  
  Association des produits aux régions de Madagascar selon leurs conditions agroclimatiques.

- **🌦️ Gestion des données climatiques régionales**  
  Stockage et exposition des données météo : température, humidité, pluviométrie, types de sol, etc.

- **🤖 Module d’intelligence artificielle**  
  Fournit des recommandations sur les cultures adaptées, prédictions de rendement, alertes sur risques climatiques.

- **📊 API d’analyses et tableaux de bord**  
  Génération de statistiques, rapports et indicateurs clés via des endpoints analytiques.

---

## 🧰 Stack technique

- **Framework :** ASP.NET Core / NestJS / Django REST Framework  
- **Langage :** C# / TypeScript / Python  
- **Base de données :** PostgreSQL (prise en charge des géodonnées avec PostGIS)  
- **ORM :** Entity Framework Core / TypeORM / Django ORM  
- **Authentification :** JWT + Refresh Tokens  
- **Tests :** xUnit / Jest / Pytest  
- **CI/CD :** Azure DevOps / GitHub Actions  
- **Documentation API :** Swagger / OpenAPI  
- **IA / ML :** Microservice Python (FastAPI, Scikit-learn, TensorFlow)

---

## 🗺️ Architecture simplifiée

```
[Frontend AgriSense] ⇄ [AgriSense API Backend] ⇄ [PostgreSQL + AI Engine]
        │
        ├── /api/products
        ├── /api/seeds
        ├── /api/regions
        ├── /api/climate
        └── /api/analytics
```

---

## 💡 Objectif

Centraliser les données agricoles et climatiques de Madagascar, tout en offrant une base solide pour la **prise de décision, l’analyse et la planification durable** des cultures.

---

## ⚙️ Installation & démarrage (exemple pour .NET)

```bash
# Cloner le projet
git clone https://github.com/tonprofil/agrisense-api.git
cd agrisense-api

# Restaurer les dépendances
dotnet restore

# Appliquer les migrations
dotnet ef database update

# Lancer le serveur
dotnet run
```

L’API sera accessible sur :
```
http://localhost:5000/swagger
```

---

## 📜 Licence

Ce projet est distribué sous la licence **MIT**.
