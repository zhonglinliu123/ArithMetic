<?php

//PHP 利用TrieTree实现敏感词的过滤



include "Tree.php";

$tree = new Tree();
$tree->addWord('傻逼');
$tree->addWord('你妈');
$tree->addWord('草');
$tree->addWord('孤儿');
$tree->addWord('日');
$tree->addWord('逼');
$tree->addWord('违禁');
$tree->addWord('妈');
$tree->addWord('杀');
//print_r($tree->getRoot());
print_r($tree->filter('dd杀哈哈哈日'));



