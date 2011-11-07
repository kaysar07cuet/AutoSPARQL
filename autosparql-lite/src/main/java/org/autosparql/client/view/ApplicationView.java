package org.autosparql.client.view;

import java.util.LinkedList;
import java.util.SortedSet;
import java.util.logging.Logger;

import org.autosparql.client.AppEvents;
import org.autosparql.client.widget.SearchResultPanel;
import org.autosparql.shared.Example;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.mvc.Controller;
import com.extjs.gxt.ui.client.mvc.View;
import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class ApplicationView extends View
{
private final Logger log = Logger.getLogger(ApplicationView.class.toString());

	//private Viewport viewport;
	private VerticalPanel panel = new VerticalPanel();
	//	private InputPanel north;
	private SearchResultPanel center = null;

	public ApplicationView(Controller controller)
	{
		super(controller);
	}

	protected void initialize()	
	{
		super.initialize();
	}

	public void display(SortedSet<Example> examples)
	{
		if(examples==null||examples.isEmpty())
		{
			log.severe("No examples to display");
			//if(RootPanel.get("gwt-table")!=null) {RootPanel.get("gwt-table").clear();}
			return;
		}
		if(center==null) {createCenter();RootPanel.get("gwt-table").add(panel);}
		//		for(Example example: examples)
		//		center.gridStore.add(example);
		center.setResult(new LinkedList<Example>(examples));
		//Window.alert("display");
	}

	private void initUI()
	{
//		viewport = new Viewport();
//		viewport.setLayout(new BorderLayout());

		//String query = com.google.gwt.user.client.Window.Location.getParameter("query");
		//        if(query==null||query.isEmpty())
		//        {
		//        	viewport.add(new Label("no query asked"));
		//        }
		//        else
		//        {
		//        	
		//    		createCenter();        	
		//        }
		//		createNorth();

		//RootPanel.get("gwt-table").add(viewport);
	}

	//	private void createNorth() {
	//		north = new InputPanel();
	//		viewport.add(north, new BorderLayoutData(LayoutRegion.NORTH));
	//	}

	private void createCenter()
	{
		center = new SearchResultPanel();
		//viewport.add(center.grid, new BorderLayoutData(LayoutRegion.CENTER));
		//viewport.add(center, new BorderLayoutData(LayoutRegion.CENTER));
		panel.add(center);
		
		HorizontalPanel buttonPanel = new HorizontalPanel();
		//viewport.add(buttonPanel, new BorderLayoutData(LayoutRegion.SOUTH));
		panel.add(buttonPanel);
		Button learnButton = new Button("learn");
		buttonPanel.add(learnButton);
		learnButton.addSelectionListener(new SelectionListener<ButtonEvent>(
				)
				{		
			@Override
			public void componentSelected(ButtonEvent ce)
			{
				center.learn();
			}
				});
	}

	protected void handleEvent(AppEvent event) {
		if (event.getType() == AppEvents.Init) {
			initUI();
		}
	}

	public void showError(String string)
	{

	}

}