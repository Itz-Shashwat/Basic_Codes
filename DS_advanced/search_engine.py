class tree:
    def __init__(self, query):
        self.query = query
        self.left = None
        self.right = None

class BST:
    def __init__(self):
        self.root = None
    
    def insert(self, query):
        if self.root is None:
            self.root = tree(query)
        else:
            self._insert(self.root, query)
    
    def _insert(self, node, query):
        if query < node.query:
            if node.left is None:
                node.left = tree(query)
            else:
                self._insert(node.left, query)
        elif query > node.query:
            if node.right is None:
                node.right = tree(query)
            else:
                self._insert(node.right, query)
    
    def search(self, query):
        return self._search(self.root, query)
    
    def _search(self, node, query):
        if node is None:
            return False
        if node.query == query:
            return True
        elif query < node.query:
            return self._search(node.left, query)
        else:
            return self._search(node.right, query)
    
    def autocomplete(self, prefix):
        results = []
        self.comp(self.root, prefix, results)
        return results
    
    def comp(self, node, prefix, results):
        if node is None:
            return
        if node.query.startswith(prefix):
            self.comp(node.left, prefix, results)
            results.append(node.query)
            self.comp(node.right, prefix, results)
        elif prefix < node.query:
            self.comp(node.left, prefix, results)
        else:
            self.comp(node.right, prefix, results)


if __name__=='__main__':
    search_engine = BST()
    search_engine.insert("apple")
    search_engine.insert("app")
    search_engine.insert("banana")
    search_engine.insert("ball")
    search_engine.insert("bat")
    search_engine.insert("balla")
    print(search_engine.search("apple"))  
    print(search_engine.search("pink"))  
    print(search_engine.autocomplete("ba"))
