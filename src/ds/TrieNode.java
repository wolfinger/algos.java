package io.wolfinger.algos.ds;

import java.util.HashMap;

public class TrieNode {
    public HashMap<Character, TrieNode> kids;

    public TrieNode() {
        kids = new HashMap<Character, TrieNode>();
    }
}
