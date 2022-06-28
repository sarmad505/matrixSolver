class ero:
    M = []
    nr = 0
    nc = 0

    def __init__(self, Mat):
        self.M = Mat
        self.nr = len(self.M)
        self.nc = len(self.M[0])

    def printMatrix2(self):
        # noOfRows = len (self.M)
        # noOfColumns = len (self.M[0])
        for r in range(self.nr):
            for c in range(self.nc):
                print("%6.2f" % (self.M[r][c]), end="\t")
            print()
        print("--------------------------------------------")

    def printMatrix(self,matrix):
        noOfRows = len(matrix)
        noOfColumns = len(matrix[0])
        for r in range(noOfRows):
            for c in range(noOfColumns):
                print("%6.2f" % (self.M[r][c]), end="\t")
            print()
        print("--------------------------------------------")

    def inputMatrix2(this):
        noOfRows = int(input("enter row value: "))
        noOfColumns = int(input("enter column value: "))
        this.M=[]
        for r in range(noOfRows):
            row = []
            for c in range(noOfColumns):
                element = int(input(f"enter number {j + 1} "))
                R.append(element)
            this.M.append(row)
        # return matrix

    def inputMatrix():
        noOfRows = int(input("enter row value: "))
        noOfColumns = int(input("enter column value: "))
        matrix = []
        for r in range(noOfRows):
            row = []
            for c in range(noOfColumns):
                element = float(input(f"enter number {j + 1} "))
                row.append(element)
            matrix.append(row)
        return matrix

    def makePivotOne2(self, pivotRow, pivotColumn):
        # numberOfColumns = len (matrix[0])
        pivotElement = self.M[pivotRow][pivotColumn]
        for c in range(self.nc):
            self.M[pivotRow][c] = self.M[pivotRow][c] / pivotElement
        # return matrix

    def makePivotOne(self,matrix, pivotRow, pivotColumn):
        noOfColumns = len(matrix[0])
        pivotElement = matrix[pivotRow][pivotColumn]
        for c in range(noOfColumns):
            matrix[pivotRow][c] = matrix[pivotRow][c] / pivotElement
        return matrix

    def makePivotCOlZero(self,matrix, pivotRow, pivotColumn):
        noOfRows = len(matrix)
        noOfColumns = len(matrix[0])
        for r in range(noOfRows):
            if r != pivotRow:
                pivotValue = matrix[r][pivotColumn]
                for c in range(noOfColumns):
                    matrix[r][c] = matrix[r][c] - matrix[pivotRow][c] * pivotValue
        return matrix


# -------------------------Main Program----------------------------------

c = ero([[1, 2, 3], [4, 5, 6]])
c.printMatrix2()
for r in range(c.nc):
    c.makePivotOne2(r, r)
    c.makePivotCOlZeroColZero(r, r)
c.printMatrix2()


















