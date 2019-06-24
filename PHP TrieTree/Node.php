<?php


class Node
{
    private $data;
    private $childrenNode = [];
    private $isEndChar = false;

    public function __construct($data)
    {
        $this->data = $data;
    }

    /**
     * @param array $childrenNode
     */
    public function setChildrenNode(array $childrenNode): void
    {
        $this->childrenNode = $childrenNode;
    }
    /**
     * @return array
     */
    public function getChildrenNode(): array
    {
        return $this->childrenNode;
    }

    /**
     * @param mixed $data
     */
    public function setData($data): void
    {
        $this->data = $data;
    }
    /**
     * @return mixed
     */
    public function getData()
    {
        return $this->data;
    }

    /**
     * @param bool $isEndChar
     */
    public function setIsEndChar(bool $isEndChar): void
    {
        $this->isEndChar = $isEndChar;
    }
    /**
     * @return bool
     */
    public function isEndChar(): bool
    {
        return $this->isEndChar;
    }


}