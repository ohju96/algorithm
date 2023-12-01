package main

import (
	"bytes"
	"log"
)

func main() {
	log.Println(mergeAlternately("abc", "pqrc"))
}

func mergeAlternately(word1 string, word2 string) string {
	var b bytes.Buffer
	i, j := 0, 0
	for i < len(word1) || j < len(word2) {
		if i < len(word1) {
			b.WriteByte(word1[i])
			i++
		}
		if j < len(word2) {
			b.WriteByte(word2[j])
			j++
		}
	}
	return b.String()
}
