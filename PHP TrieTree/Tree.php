<?php
include "Node.php";

class Tree
{
    private $root;
    function __construct(){
        $this->root = new Node("");
    }

    /**
     * @return Node
     */
    public function getRoot(): Node
    {
        return $this->root;
    }

    /**
        向模型中添加数据
     */
    public function addWord($word){
        if(self::findWord($word)){
            return false;
        }
        $p = $this->root;
        for($i=0; $i<strlen($word); $i++){
            $index = $data = $word[$i];
            if(empty($p->getChildrenNode()[$index])){
                $newNode = new Node($data);
                $temp = $p->getChildrenNode();
                $temp[$index] = $newNode;
                $p->setChildrenNode($temp);
            }
            $p = $p->getChildrenNode()[$index];
        }
        $p->setIsEndChar(true);
        return true;
    }

    /**
        检查模型中是否包含这个词
     */
    public function findWord($word){
        $p = $this->root;
        for($i=0; $i<strlen($word); $i++){
            $index = $word[$i];
            if(empty($p->getChildrenNode()[$index])){
                return false;
            }elseif($i == strlen($word)-1 ){
                if($p->getChildrenNode()[$index]->isEndChar()){
                    return true;
                }else{
                    return false;
                }
            }
            $p = $p->getChildrenNode()[$index];
        }
    }

    /**
        过滤, 敏感词用*代替
     */

    public function filter($word){
        $result = '';
        for($i=0; $i<strlen($word); $i++){
            $p = $this->root;
            $index = $word[$i];
            if(empty($p->getChildrenNode()[$index])){
                // 不存在,直接拼接
                $result .= $index;
            }else{
                // 存在则继续向下判断
                $p = $p->getChildrenNode()[$index];
                // 记录为word的最后位置
                $wordLastChar = -1;
                // $p->data 是一个单词的结尾, 更新$wordLastChar
                if($p->isEndChar()){
                    $wordLastChar = $i;
                }
                // 遍历$j , 找到最大的$wordLastChar
                for($j=$i+1; $j<strlen($word); $j++){
                    $index_1 = $word[$j];
                    if(empty($p->getChildrenNode()[$index_1])){
                        break;
                    }else{
                        $p = $p->getChildrenNode()[$index_1];
                        if($p->isEndChar()){
                            $wordLastChar = $j;
                        }
                    }
                }
                //没有作为结尾的单词, 拼接原字符
                if($wordLastChar == -1){
                    $result .= $index;
                }else{
                    // 将单词替换成*
                    $temp = $i;
                    for(; $temp<=$wordLastChar ; $temp++){
                        $result .= '*';
                    }
                    // $i从$wordLastChar开始遍历
                    $i = $wordLastChar;
                }
            }
        }
        return $result;
    }

}
