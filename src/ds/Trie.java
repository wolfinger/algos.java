package io.wolfinger.algos.ds;

import java.util.ArrayList;
import java.util.Map;

public class Trie {
    public TrieNode root;
    public ArrayList<String> words;

    public Trie() {
        root = new TrieNode();
        words = new ArrayList<>();
    }

    public TrieNode search(String word) {
        TrieNode currKid = root;
        char[] wordArr = word.toCharArray();

        for (char ch : wordArr) {
            TrieNode kidNode = currKid.kids.get(ch);

            if (kidNode != null) {
                currKid = kidNode;
            } else {
                return null;
            }
        }

        return currKid;
    }

    public TrieNode insert(String word) {
        TrieNode currKid = root;
        char[] wordArr = word.toCharArray();

        for (char ch : wordArr) {
            TrieNode kidNode;

            kidNode = currKid.kids.get(ch);

            if (kidNode != null) {
                currKid = kidNode;
            } else {
                TrieNode newKid = new TrieNode();
                currKid.kids.put(ch, newKid);
                currKid = newKid;
            }
        }

        currKid.kids.put('*', null);

        return currKid;
    }

    public void collectAllWords(TrieNode node, String word) {
        TrieNode currKid = node;
        if (currKid == null) {
            currKid = root;
        }

        for (Map.Entry<Character, TrieNode> element : currKid.kids.entrySet()) {
            Character key = element.getKey();
            if (key == '*') {
                words.add(word);
            } else {
                collectAllWords(element.getValue(), word + key);
            }
        }
    }
}
