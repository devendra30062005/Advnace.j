package in.co.rays.marksheet2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;


public class TestMarksheet {


					public static void main(String[] args) throws Exception {

						//testAdd();
						// testDelete();
						 testFindByPk();
						// testSearch();

					}

					private static void testSearch() throws Exception {

						MarksheetModel model = new MarksheetModel();

						List list = model.search();

						Iterator it = list.iterator();

						while (it.hasNext()) {

							MarksheetBean bean = (MarksheetBean) it.next();

							System.out.print(bean.getId());
							System.out.print("\t" + bean.getName());
							System.out.print("\t" + bean.getRoolno());
							System.out.print("\t" + bean.getPhysics());
							System.out.print("\t" + bean.getChemistry());
							System.out.println("\t" + bean.getMaths());

						}

					}

					private static void testFindByPk() throws Exception {

						MarksheetModel model = new MarksheetModel();

						MarksheetBean bean = model.findByPk(2);

						if (bean != null) {

							System.out.print(bean.getId());
							System.out.print("\t" + bean.getName());
							System.out.print("\t" + bean.getRoolno());
							System.out.print("\t" + bean.getPhysics());
							System.out.print("\t" + bean.getChemistry());
							System.out.println("\t" + bean.getMaths());

						} else {
							System.out.println("ID not found...!!!");
						}

					}

					private static void testDelete() throws Exception {

						MarksheetModel model = new MarksheetModel();
						model.delete(13);

					}

					private static void testAdd() throws Exception {

						MarksheetBean bean = new MarksheetBean();

						bean.setId(13);
						bean.setRoolno(113);
						bean.setName("dilip");
						bean.setPhysics(78);
						bean.setChemistry(89);
						bean.setMaths(78);

						MarksheetModel model = new MarksheetModel();

						model.add(bean);

					}

				}


		}


