# ai assisted
from pathlib import Path

# Folder where this script is located
ROOT = Path(__file__).resolve().parent

EXCLUDED_FILES = {
    "index.snbt",
    "chapter.snbt",
}

EXCLUDED_DIRS = {
    "f6ff60ce",
    "5ed1ba60",
}

files = []

# Recursively search all folders under the script's folder
for path in ROOT.rglob("*.snbt"):
    # Skip files inside excluded folders
    if any(part in EXCLUDED_DIRS for part in path.parts):
        continue

    # Skip excluded files
    if path.name in EXCLUDED_FILES:
        continue

    files.append(path)

# Print matching files
for path in files:
    print(path.relative_to(ROOT))

print(f"\nFound {len(files)} quests.")

input("\nPress Enter to exit...")