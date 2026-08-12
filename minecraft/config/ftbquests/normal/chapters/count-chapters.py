#ai assisted
from pathlib import Path

# Folder where this script is located
ROOT = Path(__file__).resolve().parent

count = 0

# Recursively search for chapter.snbt
for path in ROOT.rglob("chapter.snbt"):
    count += 1

print(f"Found {count} chapter.snbt files.")

input("\nPress Enter to exit...")