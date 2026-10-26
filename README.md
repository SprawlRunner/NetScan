# NetScan

> Scanner réseau en console écrit en Java avec détection d'hôtes, scan de ports TCP, inventaire de parc et rapports.
>
> Projet personnel en Java  réalisé avec uniquement avec les notions vu en cours.
>
> Ce projet est un outil pédagogique, destiné à l'analyse de son propre réseau domestique, de localhost ou de machines dont on possède l'autorisation.

## Fonctionnalités

| Fonctionnalité | État |
|---|---|
| Menu console interactif | OK |
| Détection d'un hôte (TCP ping) | en cours |
| Scan des ports ouverts d'un hôte (ports courants 22, 80, 443, etc..) | en cours |
| Scan d'une plage d'adresses (notation CIDR, ex. `192.168.1.0/24`) | en cours |
| Parallélisation du scan (threads, synchronisation) | en cours |
| Inventaire persistant (collections, sérialisation) | en cours |
| Export de rapports (texte + CSV) | en cours |
| Comparaison de deux scans (hôtes apparus ou disparus) | en cours |

## Compilation et exécution

**Prérequis** : Java 21 ou plus récent

```bash
# Compiler (depuis la racine du dépôt)
javac netscan/*.java netscan/model/*.java netscan/reseau/*.java netscan/io/*.java

# Lancer (nom de classe complet avec le point)
java netscan.NetScan

# Lancer avec des options (affichage des options au démarrage)
java netscan.NetScan --timeout 800
```

## Utilisation

Au lancement, le menu principal propose :

```texte
1. Scanner une plage — ex. 192.168.1.0/24
2. Scanner un hôte  — ex. 192.168.1.1
3. Inventaire       — hôtes connus, tris
4. Rapport          — export texte + CSV
5. Comparer         — diff entre deux scans
0. Quitter
```

<!-- 💡 En séance 2, remplace cette section par une VRAIE session copiée depuis ta console (sortie réelle du programme dans un bloc ```), c'est ce que les visiteurs regardent en premier. -->

## Captures d'écran

<!-- 
![Menu principal](docs/captures/menu.png)
![Premier scan](docs/captures/scan.png)
-->

## Structure du projet

```texte
netscan/
├── NetScan.java            # Menu console, orchestration
├── model/
│   ├── Hote.java           # Une machine (IP, ports, date du scan)
│   ├── ResultatScan.java   # Une campagne de scan complète
│   └── Inventaire.java     # Map des hôtes, persistance
├── reseau/
│   ├── ScannerIp.java      # Détection d'un hôte (ping)
│   ├── ScannerPorts.java   # Test des ports d'un hôte
│   ├── ScannerPlage.java   # Décodage CIDR + orchestration
│   └── PlageInvalideException.java
└── io/
    ├── ExporteurRapport.java   # Rapports textuel + CSV
    └── ComparateurScan.java    # Différence entre deux scans
```

## Feuille de route

- **v0.1** — Squelette du projet: menu console, packages, GitHub
- **v1.0** — Scanner complet: détection, ports, plage CIDR, threads, inventaire, rapports
- **v1.5** — Qualité: tests JUnit, javadoc complète
- **v2.0** — Plateforme de supervision

## Auteur

> **SprawlRunner**