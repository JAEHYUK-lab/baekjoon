package divideAndConquer;

import java.io.*;
import java.util.*;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class _2261 {
	public static long distSquare(Point A, Point B) {
		return (long) ((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Point[] p = new Point[n];
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			p[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		Arrays.sort(p, (a, b) -> (a.x - b.x));

		TreeSet<Point> set = new TreeSet<>((a, b) -> ((a.y == b.y) ? a.x - b.x : a.y - b.y));
		set.add(p[0]);
		set.add(p[1]);

		long answer = distSquare(p[0], p[1]);
		int start = 0;
		for (int i = 2; i < n; i++) {
			Point cur = p[i];
			while (start < i) {
				Point point = p[start];
				long k = cur.x - point.x;

				if (k * k > answer) {
					set.remove(point);
					start++;
				} else {
					break;
				}
			}

			int d = (int) Math.sqrt((double) answer) + 1;

			Point from = new Point(-10001, cur.y - d);
			Point to = new Point(10001, cur.y + d);

			for (Point point : set.subSet(from, to)) {
				long distance = distSquare(cur, point);
				answer = Math.min(answer, distance);
			}
			set.add(cur);
		}

		bw.write(answer + "\n");
		bw.flush();
		br.close();
		bw.close();

	}
}
