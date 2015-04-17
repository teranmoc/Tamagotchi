#!/bin/sh

if [ $# -ne 1 ]
then
	echo "Usage : [nom classe] [[description] ]"
	exit
fi
nom="$1.java"
jour=`date | cut -d"," -f1`

#if [ "$2" = "" ]
#then
#	$descr = "Entrez la description ici"
#else
#then
#	$descr = $2
#fi

touch $nom
echo "/* Fichier $nom" > $nom
echo "Crée le $jour" >> $nom
echo "MAJ : $jour" >> $nom
echo "Description : $descr */" >> $nom
echo "" >> $nom
echo "public class $1" >> $nom
echo "{" >> $nom
echo "\tpublic $1()" >> $nom
echo "\t{" >> $nom
echo "\t}" >> $nom
echo "}" >> $nom

echo "Le fichier généré est $nom dans le répertoire courant"
