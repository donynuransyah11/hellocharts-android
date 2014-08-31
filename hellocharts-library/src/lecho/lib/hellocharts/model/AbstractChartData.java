package lecho.lib.hellocharts.model;

import android.graphics.Color;

/**
 * Base class for most chart data models.
 * 
 * @author Leszek Wach
 * 
 */
public abstract class AbstractChartData implements ChartData {
	public static final int DEFAULT_TEXT_SIZE_SP = 12;
	protected Axis axisXBottom = new Axis();
	protected Axis axisYLeft = new Axis();
	protected int axesColor = Color.LTGRAY;
	protected int axesLabelTextSize = DEFAULT_TEXT_SIZE_SP;
	protected int valueLabelTextColor = Color.WHITE;
	protected int valueLabelTextSize = DEFAULT_TEXT_SIZE_SP;
	protected int maxLabelChars = 5;

	public AbstractChartData() {

	}

	public AbstractChartData(AbstractChartData data) {
		this.axisXBottom = new Axis(data.axisXBottom);
		this.axisYLeft = new Axis(data.axisYLeft);
		this.axesColor = data.axesColor;
		this.axesLabelTextSize = data.axesLabelTextSize;
		this.valueLabelTextColor = data.valueLabelTextColor;
		this.valueLabelTextSize = data.valueLabelTextSize;
		this.maxLabelChars = data.maxLabelChars;
	}

	public void setAxisXBottom(Axis axisXBottom) {
		if (null == axisXBottom) {
			this.axisXBottom = new Axis().setAutoGenerated(false);
		} else {
			this.axisXBottom = axisXBottom;
		}
	}

	public Axis getAxisXBottom() {
		return axisXBottom;
	}

	public void setAxisYLeft(Axis axisYLeft) {
		if (null == axisYLeft) {
			this.axisYLeft = new Axis().setAutoGenerated(false);
		} else {
			this.axisYLeft = axisYLeft;
		}
	}

	public Axis getAxisYLeft() {
		return axisYLeft;
	}

	public int getAxesColor() {
		return axesColor;
	}

	public void setAxesColor(int axesColor) {
		this.axesColor = axesColor;
	}

	public int getAxesLabelTextSize() {
		return axesLabelTextSize;
	}

	public void setAxesLabelTextSize(int axesLabelTextSize) {
		this.axesLabelTextSize = axesLabelTextSize;
	}

	public int getValueLabelTextColor() {
		return valueLabelTextColor;
	}

	public void setValueLabelsTextColor(int valueLabelTextColor) {
		this.valueLabelTextColor = valueLabelTextColor;
	}

	public int getValueLabelTextSize() {
		return valueLabelTextSize;
	}

	public void setValueLabelTextSize(int valueLabelTextSize) {
		this.valueLabelTextSize = valueLabelTextSize;
	}

	@Override
	public void setMaxLabelChars(int numChars) {
		if (numChars < 0) {
			numChars = 0;
		} else if (numChars > 32) {
			numChars = 32;
		}
		maxLabelChars = numChars;
	}

	@Override
	public int getMaxAxisLabelChars() {
		return maxLabelChars;
	}

}