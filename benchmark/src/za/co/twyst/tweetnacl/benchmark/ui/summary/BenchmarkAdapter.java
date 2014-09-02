package za.co.twyst.tweetnacl.benchmark.ui.summary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import za.co.twyst.tweetnacl.benchmark.R;
import za.co.twyst.tweetnacl.benchmark.entity.Measurement;

public class BenchmarkAdapter extends BaseAdapter
       { // CONSTANTS
	
	     @SuppressWarnings("unused")
		 private static final String TAG      = BenchmarkAdapter.class.getSimpleName();
	     private static final int[]  HEADINGS = { 
//	                                              R.string.blank,
//	    	                                      R.string.min,
//	    	                                      R.string.average,
//	    	                                      R.string.max,
//	    	                                      R.string.runs
	     	                                    };
	     
	     // INSTANCE VARIABLES
	     
//	     private final LayoutInflater inflater;
//	     private final Measurement[]    benchmarks;
	     
	     // CONSTRUCTOR
	     
//	     public BenchmarkAdapter(LayoutInflater inflater,LABEL[] parsers)
//	            { this.inflater   = inflater;
//	              this.benchmarks = new Measurement[parsers.length];
//	              
//	              for (int i=0; i<parsers.length; i++)
//	                  { benchmarks[i] = new Measurement(parsers[i]);
//	                  }
//	            }

	     // INSTANCE METHODS
	     
	     public void clear() 
	            { 
//	              for (Measurement benchmark: benchmarks)
//	                  { benchmark.clear();
//	                 }
	            }
	     
//	     public Measurement update(LABEL parser,long dt) 
//	            { 
//	              Measurement benchmark = null;
//	            
//	    	      for (Measurement item: benchmarks)
//	                  { if (item.parser == parser)
//	                       { benchmark = item;
//	                         break;
//	                       }
//	                  }
//	            
//	    	      if (benchmark != null)
//	    	         { benchmark.update(dt);
//	    	           notifyDataSetChanged();
//	    	         }
//	    	      
//	    	      return benchmark;
//	            }

		 // *** BaseAdapter ***
	
	     @Override
	     public int getViewTypeCount() 
	            { return 2;
	            }
	     
	     @Override
		 public int getItemViewType(int position) 
	            { return position % 5 == 0 ? 1 : 0;
	            }

		 @Override
	     public int getCount() 
	            { return 0; // benchmarks.length * 6;
	            }

	     @Override
	     public Object getItem(int position) 
	            { return null;
	            }

	     @Override
	     public long getItemId(int position) 
	            { return 0;
	            }

	     @Override
	     public View getView(int position,View convertView,ViewGroup parent)
	            { View view = convertView;
	              Holder holder;
	            
//	              if (view == null)
//	                 { int type   = getItemViewType(position);
//	                   int layout = type == 1 ? R.layout.label : R.layout.value;
//	                   
//	            	   view   = inflater.inflate(layout,parent,false);
//	                   holder = new Holder      (view);
//	                   
//	                   view.setTag(holder);
//	                 }
//	                 else
//	                 { holder = (Holder) view.getTag();
//	                 }
//
//	              // ... initialise 
//	              
//	              int row = position/5;
//	              
//	              if (row == 0)
//	                 { holder.initialise(HEADINGS[position % 5]);
//	                 }
//	                 else
//	                 { Benchmark benchmark = benchmarks[row - 1];
//	                   
//	                   holder.initialise(benchmark,position % 5);
//	                 }
	              
	              return view;
	            }
	     
	     // INNER CLASSES
	     
	     private static class Holder
	             { private TextView textview;
	             
  	               public Holder(View view) 
  	                      { this.textview = (TextView) view.findViewById(R.id.textview);
  	                      }

  	               public void initialise(int rid) 
  	                      { textview.setText(rid);
  	                      }

//  	               public void initialise(Benchmark benchmark,int col) 
//  	                      { switch(col)
//  	            	              { case 0:
//  	            	                     textview.setText(benchmark.parser.label);
//  	            	                     break;
//  	            	                     
//  	            	                case 1:
// 	            	                     textview.setText(benchmark.min());
// 	            	                     break;
//  	            	                     
//  	            	                case 2:
// 	            	                     textview.setText(benchmark.average());
// 	            	                     break;
//  	            	                     
//  	            	                case 3:
// 	            	                     textview.setText(benchmark.max());
// 	            	                     break;
//  	            	                     
//  	            	                case 4:
// 	            	                     textview.setText(benchmark.runs());
// 	            	                     break;
//  	            	              }
//  	                      }
	             }
        }
