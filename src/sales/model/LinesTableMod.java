package sales.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LinesTableMod extends AbstractTableModel {

    private ArrayList<LineD> lines;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public LinesTableMod(ArrayList<LineD> lines) {
        this.lines = lines;
    }
    public ArrayList<LineD> getLines() {
        return lines;
    }
    

    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LineD line = lines.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return line.getInvoice().getNumber();
            case 1:
                return line.getItemName();
            case 2:
                return line.getPrice();
            case 3:
                return line.getCount();
            case 4:
                return line.getLineTotal();
            default:
                return "";

        }

    }

}
